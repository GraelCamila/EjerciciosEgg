
package main;

import entidad.Cancion;

public class Main {
    public static void main(String[] args) {
        
        Cancion can = new Cancion();
        
        can.setAutor("Miranda");
        can.setTitulo("Perfecta");
        
        System.out.println("Autor: " + can.getAutor());
        System.out.println("Cancion: " + can.getTitulo());
    }
}
