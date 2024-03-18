
package guia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los grados centígrados");
        int cen = leer.nextInt();
        int fah = 32 + (9 * cen /5);
        
        System.out.println(fah + "° fahrenheit es el equivalente a " + cen + "° centigrados");
    }
}
