package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public void datos() {
        int cont;
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula en horas");
            pelicula.setDuracion(leer.nextDouble());
            peliculas.add(pelicula);

            do {
                cont = 0;
                System.out.println("¿Desea ingresar otra pelicula? S/N");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")) {
                    if (resp.equalsIgnoreCase("N")) {
                        cont++;
                    }
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont = 5;
                }
            } while (cont == 5);
        } while (cont == 0);
    }

    public void mostrarPeliculas() {
        for (Pelicula pel : peliculas) {
            System.out.println(pel);
        }
    }

    public void mayor1Hora() {
        for (Pelicula pel : peliculas) {
            if (pel.getDuracion() > 1) {
                System.out.println(pel);
            }
        }
    }
    
    public void ordenarMayorAMenor(){
        peliculas.sort(Pelicula.compararDuracion);
        mostrarPeliculas();
    }
    
    public void ordenarMenorAMayor(){
        peliculas.sort(Pelicula.compararDuracion);
        Collections.reverse(peliculas);
        mostrarPeliculas();
    }
    
    public void ordenarTitulo(){
        peliculas.sort(Pelicula.compararTitulo);
        mostrarPeliculas();
    }
    
    public void ordenarDirector(){
        peliculas.sort(Pelicula.compararDirector);
        mostrarPeliculas();
    }
}
