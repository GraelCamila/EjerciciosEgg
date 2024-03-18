
package guia1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        
        int res = num * 2;
        System.out.println("El doble de " + num + " es: " + res);
        res = num * 3;
        System.out.println("El triple de " + num + " es: " + res);
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
}
