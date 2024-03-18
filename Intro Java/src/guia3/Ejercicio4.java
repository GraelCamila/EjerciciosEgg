
package guia3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (esPrimo(num) == true) {
            System.out.println(num + " es un numero primo");
        } else {
            System.out.println(num + " no es un numero primo");
        }
    }
    
    public static boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                break;
            }
        }
        return cont<=2;
    }
}

