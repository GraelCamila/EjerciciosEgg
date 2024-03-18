
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar un numero entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("En numeros romanos " + num + " = I");
                break;
            case 2:
                System.out.println("En numeros romanos " + num + " = II");
                break;
            case 3:
                System.out.println("En numeros romanos " + num + " = III");
                break;
            case 4:
                System.out.println("En numeros romanos " + num + " = IV");
                break;
            case 5:
                System.out.println("En numeros romanos " + num + " = V");
                break;
            case 6:
                System.out.println("En numeros romanos " + num + " = VI");
                break;
            case 7:
                System.out.println("En numeros romanos " + num + " = VII");
                break;
            case 8:
                System.out.println("En numeros romanos " + num + " = VIII");
                break;
            case 9:
                System.out.println("En numeros romanos " + num + " = IX");
                break;
            case 10:
                System.out.println("En numeros romanos " + num + " = X");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
        }
        
        
        
    }
}
