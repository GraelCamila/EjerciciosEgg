
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de familias");
        int f = leer.nextInt();
        int h, edad, prom, auxf=0, auxh=0;
        
        for (int i = 0; i < f; i++) {
            prom =0;
            System.out.println("Ingrese la cantidad de hijos de la " + (i+1) + "° familia");
            h = leer.nextInt();
            auxh +=h;
            for (int j = 0; j < h; j++) {
                System.out.println("Ingrese la edad del "+(j+1)+"° hijo");
                edad = leer.nextInt();
                prom+=edad;
            }
            auxf += prom;
            prom /=h;
            System.out.println("El promedio de edad de los hijos de la "+(i+1)+"° familia es de " + prom + " años");
            System.out.println("");
            
  
        }
        
        System.out.println("El promedio de edad de los hijos de las "+ f +" familias es de "+ (auxf/auxh) + " años");
        
    }
}
