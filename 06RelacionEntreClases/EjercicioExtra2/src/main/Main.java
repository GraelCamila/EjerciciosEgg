
package main;

import servicio.CineServicio;

public class Main {
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        
        cs.crearPelicula();
        cs.elegirPelicula();
        System.out.println("");
        cs.espectadorIngresar();
        cs.crearSala();
        cs.asientos();
        
        
        
    }
}
