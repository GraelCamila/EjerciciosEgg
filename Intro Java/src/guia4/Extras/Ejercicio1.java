
package guia4.Extras;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] v = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            v[i] = leer.nextInt();
            suma += v[i];
        }
        
        System.out.println("VECTOR:");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
        System.out.println("");
        System.out.println("La suma de los numeros ingresados es " + suma);
        
    }
}
