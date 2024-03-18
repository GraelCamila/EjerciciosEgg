
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num, cont=0, par=0, impar=0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont++;
            if (num > 0) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            if (num%5 == 0) {
                break;
            }
            
            
        } while (num%5 != 0);
        
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
        
    }
}
