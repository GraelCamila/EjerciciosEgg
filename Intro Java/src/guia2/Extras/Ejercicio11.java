
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int cont1, cont2 =0;
        
        do {
            cont1 =0;
            num = num /10;
            cont2++;
            if (num > 0) {
                cont1++;
            }
        } while (cont1 !=0);
        
        System.out.println("El numero ingresado posee " + cont2 + " digitos");
        
        
    }
}
