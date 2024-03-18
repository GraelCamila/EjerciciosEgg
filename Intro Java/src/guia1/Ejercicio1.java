
package guia1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        int res = num1 + num2;
        
        System.out.println("El resultado de la suma de los números ingresados es: " + res);
    }
    
}
