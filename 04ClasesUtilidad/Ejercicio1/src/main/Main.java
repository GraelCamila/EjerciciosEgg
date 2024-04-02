
package main;


import servicio.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        
        CadenaServicio cs = new CadenaServicio();
        
        cs.ingresarFrase();
        cs.mostrarVocales();
        cs.invertirFrase();
        cs.vecesRepetido();
        cs.unirFrases();
        cs.reemplazar();
        cs.contiene();
        
    }
}
