
package main;

import entidad.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        op.crearOperacion();
        op.sumar();
        op.restar();
        op.dividir();
        op.multiplicar();
        
    }
}
