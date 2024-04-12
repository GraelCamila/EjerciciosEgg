
package main;

import servicio.Paises;

public class Main {
    public static void main(String[] args) {
        Paises paises = new Paises();
        
        paises.ingresar();
        System.out.println("");
        System.out.println("Paises ordenados:");
        paises.ordenar();
        System.out.println("");
        paises.buscar();
    }
}
