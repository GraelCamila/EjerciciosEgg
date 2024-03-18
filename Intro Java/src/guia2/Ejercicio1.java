
package guia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
        
    }
}
