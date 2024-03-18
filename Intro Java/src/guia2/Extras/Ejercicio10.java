
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int resu = num1*num2, resp, cont;
        
        do {
            cont=0;
            System.out.println("Adivine el resultado");
            resp = leer.nextInt();
            if (resp == resu) {
                System.out.println("ADIVINASTE!");
                System.out.println(num1 + "*" + num2 + " = " + resu);
            } else {
                System.out.println("Esa no es");
                System.out.println("Vuelve a intentarlo");
                System.out.println("");
                cont++;
            }
        } while (cont != 0);
    }
}
