
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        double alt, suma1 = 0, suma2 = 0, cont1 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la " + (i+1)+ "° persona");
            alt = leer.nextDouble();
            if (alt<=1.60) {
                suma1 += alt;
                cont1++;
            }
            suma2 += alt;
        }
        System.out.println("El promedio de las estaturas que se encuentran por debajo de 1.60 mts es " + (suma1/cont1));
        System.out.println("El promedio de todas las estaturas es " + (suma2/n));
        
        
    }
}
