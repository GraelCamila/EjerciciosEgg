
package main;

import servicio.Numeros;

public class Main {
    public static void main(String[] args) {
        
        Numeros numeros = new Numeros();
        
        numeros.ingresar();
        numeros.suma();
        numeros.promedio();
    }
}
