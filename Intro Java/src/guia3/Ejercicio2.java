
package guia3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String nombre, n ="";
        int edad, cont;
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            }else {
                System.out.println(nombre + " es menor de edad");
            }
            do {
                cont=0;
                System.out.println("¿Desea seguir ingresando nombres? Si/No");
                n = leer.next();
                if (!n.equalsIgnoreCase("si") && !n.equalsIgnoreCase("no")) {
                    cont++;
                    System.out.println("Opcion ingresada no es valida");
                    System.out.println("Vuelva a intentarlo");
                }
            } while (cont!= 0);
            
        } while (n.equalsIgnoreCase("Si"));
    }
}
