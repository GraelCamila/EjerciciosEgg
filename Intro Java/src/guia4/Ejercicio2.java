
package guia4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vec = new int[n];
        
        System.out.println("Ingrese el numero a buscar dentro del vector");
        int bus = leer.nextInt();
        int cont=0;
        System.out.println("");
        for (int i = 0; i < n; i++) {
            vec[i] = (int) (Math.random()*10);
            if (bus == vec[i]) {
                cont++;
            }
        }
        if (cont == 1) {
            System.out.println("El numero " + bus + " se encuentra una vez dentro del vector");
            System.out.print("En la posicion: ");
        } else if (cont >= 2) {
            System.out.println("El numero " + bus + " se encuentra " + cont + " veces dentro del vector");
            System.out.print("En las posiciones: ");
        } else{
            System.out.println("El numero no se encuentra dentro del vector");
        }
        
        for (int i = 0; i < n; i++) {
            
            if (cont == 1 && bus == vec[i]) {
                System.out.print(i);
            } else if (cont >=2 & bus == vec[i]) {
                System.out.print(i+" - ");
            }
        }
        
        System.out.println("");
    }
}
