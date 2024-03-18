
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("DO-WHILE:");
        System.out.println("Ingrese la cantidad de numeros a calcular");
        int n = leer.nextInt();
        int num, max =0, min = 0, cont =0, suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (cont == 0) {
                min = num;
            }
            if (num > max) {
                max = num;
            }else if (num < min) {
                min = num;
            }
            cont++;
        } while (cont != n);
        
        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Pomedio: " + (suma/n));
        
        
        System.out.println("WHILE:");
        
        System.out.println("Ingrese la cantidad de numeros a calcular");
        n = leer.nextInt();
        max =0; min = 0; cont =0; suma = 0;
        
        while(cont < n){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (cont == 0) {
                min = num;
            }
            if (num > max) {
                max = num;
            }else if (num < min) {
                min = num;
            }
            cont++;
        }
        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Pomedio: " + (suma/n));
        
    }
}
