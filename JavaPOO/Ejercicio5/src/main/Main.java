
package main;

import entidad.Cuenta;

public class Main {
    public static void main(String[] args) {
        
        Cuenta c = new Cuenta();
        
        c.crearCuenta();
        c.consultarDatos();
        c.consultarSaldo();
        c.extraccionRapida();
        c.ingresar();
        c.retirar();
        
    }
}
