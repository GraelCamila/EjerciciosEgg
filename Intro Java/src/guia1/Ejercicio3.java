
package guia1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        System.out.println("");
        System.out.println("MAYÚSCULA: " + frase.toUpperCase());
        System.out.println("minúscula: " + frase.toLowerCase());
        
    }
}
