
package guia2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int cont =0;
        do {
            System.out.println("");
            System.out.println("        ~~~MENU~~~");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción:");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
                    break;
                default:
                    System.out.println("¿Esta seguro de que desea salir del programa? (S/N)");
                    String res = leer.next();
                    if (res.equalsIgnoreCase("S")) {
                        cont++;
                    }
            }

        } while (cont == 0);
        
        
        
        
    }
}
