
package guia4.Extras;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //FORMA 1:
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec1 = new int[n];
        
        int a=1,b=1,c;
        for (int i = 0; i < n; i++) {
            vec1[i]=a;
            c= a+b;
            a=b;
            b=c;
        }
        System.out.println("Sucesion de numeros Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(vec1[i]+ ", ");
        }
        System.out.println("");
        
        //FORMA 2:
        
        int[] vec2 = new int[n];
        vec2[0] = 1;
        vec2[1] = 1;
        for (int i = 2; i < n; i++) {
            vec2[i] = vec2[i - 1] + vec2[i - 2];
        }

        System.out.println(n + "Sucesion de numeros Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(vec2[i] + ", ");
        }
        System.out.println("");
    }
}