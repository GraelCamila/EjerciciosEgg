
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, res, cont=0;
        do {
            System.out.println("Ingrese dos numeros mayores a 1");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            res = num1;
            if (num1 < 1 || num2 < 1) {
                System.out.println("Uno de los numeros ingresados no es valido");
                System.out.println("Vuelva a intentarlo");
            }
        } while (num1<1 || num2 < 1);
        do {
            res = res - num2;
            cont++;
        } while (res > num2);
        
        System.out.println("Dividendo: " + num1);
        System.out.println("Divisor: " + num2);
        System.out.println("Residuo: " + res);
        System.out.println("Cociente: " + cont);
    }
}
