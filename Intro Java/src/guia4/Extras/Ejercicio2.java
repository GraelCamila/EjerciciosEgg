
package guia4.Extras;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero para el 1° vector");
            v1[i] = leer.nextInt();
        }
        int cont=0;
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero para el 2° vector");
            v2[i] = leer.nextInt();
            if (v1[i] != v2[i]) {
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                cont++;
            }
        }
        if (cont == n) {
            System.out.println("Los vectores son iguales");
        }
        
        
    }
}
