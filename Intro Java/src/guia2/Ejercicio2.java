
package guia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase es incorrecta");
        }
    }
}
