
package guia4.Extras;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int[][] mat = new int[n][m];
        int suma, sumaT = 0;
        
        for (int i = 0; i < n; i++) {
            suma = 0;
            for (int j = 0; j < m; j++) {
                mat[i][j] = (int) (Math.random()*10);
                suma += mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            sumaT += suma;
            System.out.println("suma: " + suma);
            System.out.println("");
        }
        System.out.println("La suma total de la matriz es " + sumaT);
        
    }
}
