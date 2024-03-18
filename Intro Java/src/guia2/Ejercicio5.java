
package guia2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0, max, num;
        System.out.println("Ingrese un valor limite positivo");
        max = leer.nextInt();
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
            if (suma > max) {
                System.out.println("La suma de los numeros ingresados supero el limite ingresado");
                System.out.println("La suma de los numeros ingresados dio " + suma);
            }
        } while (suma <= max);

    }
}
