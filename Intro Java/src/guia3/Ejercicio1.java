
package guia3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int cont;
        do {
            cont = 0;
            System.out.println("¿Que desea hacer? Ingrese un numero");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(num1+" + " +num2+ " = " + Suma(num1, num2));
                    break;
                case 2:
                    System.out.println(num1+" - " +num2+ " = " +Resta(num1, num2));
                    break;
                case 3:
                    System.out.println(num1+" * " +num2+ " = " + Muliplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(num1+" / " +num2+ " = " + Division(num1, num2));
                    break;
                default:
                    System.out.println("Opcion ingresado no valido");
                    System.out.println("Vuelva a intentarlo");
                    cont++;
            }
        } while (cont != 0);
        
        
        
    }
    public static int Suma(int num1, int num2) {
        return (num1+num2);
    }
    public static int Resta(int num1, int num2) {
        return (num1-num2);
    }
    public static int Muliplicar(int num1, int num2) {
        return (num1*num2);
    }
    public static int Division(int num1, int num2) {
        return (num1/num2);
    }
    
    
    
    
}
