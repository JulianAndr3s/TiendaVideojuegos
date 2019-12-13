import { AppPage } from './app.po';
import { browser, logging, element, by } from 'protractor';

describe('Prueba inicio', function() {
  it('Prueba inicio', function() {
    browser.get('http://localhost:4200/');
    expect(browser.getTitle()).toEqual('FrontendTiendaVideojuegos');
    browser.sleep(1000);
  });
});

describe('insertarCliente', function() {
  it('insertarCliente', function() {
    browser.get('http://localhost:4200/crear-cliente');
    browser.sleep(3000);

    element(by.name('nombre')).sendKeys('Julian');
    element(by.name('apellido')).sendKeys('Botero');
    element(by.name('telefono')).sendKeys('5666804');
    element(by.name('correo')).sendKeys('julian@hotmail.com');
    element(by.name('cedula')).sendKeys('1036402404');
    browser.sleep(2000);
    element(by.name('estado')).sendKeys('Inactivo');
    browser.sleep(2000);
    element(by.id('registrar')).click();
    browser.sleep(2000);
  });
});

describe('listarCliente', function() {
  it('listarCliente', function() {
    browser.get('http://localhost:4200/clientes');
    expect(browser.getTitle()).toEqual('FrontendTiendaVideojuegos');
    browser.sleep(3000);
  });
});

describe('insertarVideojuego', function() {
  it('insertarVideojuego', function() {
    browser.get('http://localhost:4200/crear-videojuego');
    browser.sleep(3000);

    element(by.name('nombre')).sendKeys('FIFA20');
    element(by.name('genero')).sendKeys('Botero');
    browser.sleep(2000);
    element(by.name('fecha')).sendKeys('12-13-2019');
    browser.sleep(2000);
    element(by.name('precio')).sendKeys(300000);
    element(by.name('autor')).sendKeys('Electronics');
    element(by.id('registrar')).click();
    browser.sleep(2000);
  });
});

describe('listarVideojuego', function() {
  it('listarVideojuego', function() {
    browser.get('http://localhost:4200/videojuegos');
    expect(browser.getTitle()).toEqual('FrontendTiendaVideojuegos');
    browser.sleep(3000);
  });
});

describe('insertarReserva', function() {
  it('insertarReserva', function() {
    browser.get('http://localhost:4200/crear-reserva');
    browser.sleep(3000);

    element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[1]/select[1]/option[1]')).click();
    browser.sleep(2000);
    element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[2]/select[1]/option[1]')).click();
    browser.sleep(2000);
    element(by.id('registrar')).click();
    browser.sleep(2000);
  });
});

describe('listarReservas', function() {
  it('listarReservas', function() {
    browser.get('http://localhost:4200/reservas');
    expect(browser.getTitle()).toEqual('FrontendTiendaVideojuegos');
    browser.sleep(3000);
  });
});
