
package guia2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cad;
        int corr=0, inc=0;
        do {
            System.out.println("Ingrese una cadena. Esta debe tener:");
            cad = leer.next().toUpperCase();
            if (cad.length() <= 5 && cad.startsWith("X") && cad.endsWith("O")) {
                corr++;
            } else {
                inc++;
            }
        } while (!cad.equals("&&&&&"));
        System.out.println("CORRECTAS: " + corr);
        System.out.println("INCORRECTAS: " + (inc-1));
    }
}
