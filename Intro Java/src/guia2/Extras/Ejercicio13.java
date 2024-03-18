
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int num2=0;
        String a ="";
        do {
            num2++;
            a = a + num2+"";
            System.out.println(a);
        } while (num2 != num);
    }
}
