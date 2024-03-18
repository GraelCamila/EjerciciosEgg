
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar la clase de socio");
        String clase = leer.next().toUpperCase();
        
        System.out.println("Ingrese el valor real del tratamiento");
        int valor = leer.nextInt();
        
        switch(clase){
            case "A":
                valor /= 2;
                System.out.println("Luego del descuento el valor del tratamiento es " + valor);
                break;
            case "B":
                valor = (valor * 35) /100;
                System.out.println("Luego del descuento el valor del tratamiento es " + valor);
                break;
            case "C":
                System.out.println("Este tipo de socio no recibe descuento");
                break;
            default:
                System.out.println("Respuesta ingresada no valida");
        }
        
        
    }
}
