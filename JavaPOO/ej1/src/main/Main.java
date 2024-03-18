
package main;

import entidad.Libro;

public class Main {
    public static void main(String[] args) {
        
        Libro primerLibro = new Libro();
        Libro segundoLibro = new Libro(123, "Esta noche digo adios", "Jeremias", 234);
        
        primerLibro.guardarLibro();
        System.out.println("Primer libro");
        primerLibro.mostrarLibro();
        
        System.out.println("Segundo libro");
        segundoLibro.mostrarLibro();
    }
}
