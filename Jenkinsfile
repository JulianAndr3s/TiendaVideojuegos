
pipeline {
  //Donde se va a ejecutar el Pipeline
  agent {
    label 'Slave_Induccion'
  }
  
  //Ejecutar automaticamente cada hora (Hay que configurar en Jenkins)
  /*triggers {
    pollSCM('@hourly')
  }*/
  
  //Opciones específicas de Pipeline dentro del Pipeline
  options {
    //Mantener artefactos y salida de consola para el # específico de ejecuciones recientes del Pipeline.
    buildDiscarder(logRotator(numToKeepStr: '3'))
    //No permitir ejecuciones concurrentes de Pipeline
    disableConcurrentBuilds()
  }
  
  //Una sección que define las herramientas para “autoinstalar” y poner en la PATH
  tools {
    jdk 'JDK8_Centos' //Preinstalada en la Configuración del Master
    gradle 'Gradle5.6_Centos' //Preinstalada en la Configuración del Master
  }
  
  //Se implementa el Jmeter
   environment{
    PROJETC_PATH_JMETER= '/opt/Apache/apache-jmeter-5.0/bin'
	}
  
  //Aquí comienzan los “items” del Pipeline
  stages {
    stage('Checkout') {
      steps {
        echo "------------>Checkout<------------"
        checkout([
          $class: 'GitSCM',
          branches: [[name: '*/master']],
          doGenerateSubmoduleConfigurations: false,
          extensions: [],
          gitTool: 'Git_Centos',
          submoduleCfg: [],
          userRemoteConfigs: [[
            credentialsId: 'GitHub_JulianAndr3s',
            url:'https://github.com/JulianAndr3s/TiendaVideojuegos'
          ]]
        ])
      }
    }
    
    stage('Build') {
      steps {
        echo "------------>Build<------------"
	
	dir("backendTiendaVideojuegos"){
          //Construir sin tarea test que se ejecutó previamente
           sh 'gradle build -x test'
	}

      }
    }
    
    stage('Tests') {
      steps {
        echo "------------>Unit Tests<------------"
	dir("backendTiendaVideojuegos"){
        sh 'gradle test'
	}
      }
    }
	
	stage('Test_carga') {
    steps {
        echo '------------>Test de carga<------------'                     
        dir("${PROJETC_PATH_JMETER}"){                          
            sh './jmeter  -n -t ${WORKSPACE}/TestVideojuegos.jmx -l ${WORKSPACE}/performacetest.jtl'   
            performanceReport parsers: [[$class: 'JMeterParser', glob: "${WORKSPACE}/performacetest.jtl"]], sourceDataFiles: "${WORKSPACE}/performacetest.jtl", errorFailedThreshold: 20, errorUnstableThreshold: 20, ignoreFailedBuilds: false, ignoreUnstableBuilds: false, relativeFailedThresholdNegative: 0, relativeFailedThresholdPositive: 0, relativeUnstableThresholdNegative: 0, relativeUnstableThresholdPositive: 0
        }
    }
}
	
    stage('Static Code Analysis') {
      steps {
        echo '------------>Análisis de código estático<------------'
        withSonarQubeEnv('Sonar') {
          sh "${tool name: 'SonarScanner',type:'hudson.plugins.sonar.SonarRunnerInstallation'}/bin/sonar-scanner"
          // sh 'gradle sonarqube'
        }
      }
    }
  }
  post {
    always {
      echo 'This will always run'
    }
    success {
      echo 'This will run only if successful'
    }
    failure {
      echo 'This will run only if failed'
      mail (to: 'julian.botero@ceiba.com.co', subject: "Failed Pipeline:${currentBuild.fullDisplayName}",
            body: "Something is wrong with ${env.BUILD_URL}")
    }
    unstable {
      echo 'This will run only if the run was marked as unstable'
    }
    changed {
      echo 'This will run only if the state of the Pipeline has changed'
      echo 'For example, if the Pipeline was previously failing but is now successful'
    }
  }
}
