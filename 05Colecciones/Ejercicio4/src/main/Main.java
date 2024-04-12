
package main;

import entidad.Pelicula;
import servicio.PeliculaServicio;

public class Main {
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        Pelicula pelicula = new Pelicula();
        
        ps.datos();
        System.out.println("");
        System.out.println("Todas las peliculas:");
        ps.mostrarPeliculas();
        System.out.println("");
        System.out.println("Mayor a una hora");
        ps.mayor1Hora();
        System.out.println("");
        System.out.println("Mayor a menor");
        ps.ordenarMayorAMenor();
        System.out.println("");
        System.out.println("Menor a mayor");
        ps.ordenarMenorAMayor();
        System.out.println("");
        System.out.println("Titulo");
        ps.ordenarTitulo();
        System.out.println("");
        System.out.println("Director");
        ps.ordenarDirector();
        
        
    }
}
