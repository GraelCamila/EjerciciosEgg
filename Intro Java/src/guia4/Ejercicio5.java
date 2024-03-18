
package guia4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] m = {{0,-2,4},{2,0,2},{-4,-2,0}};
        System.out.println("Matriz A");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] < 0) {
                    System.out.print(" |" + m[i][j]);
                } else {
                    System.out.print(" | " + m[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B");
        int contm=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[j][i] < 0) {
                    System.out.print(" |" + m[j][i]);
                } else {
                    System.out.print(" | " + m[j][i]);
                }
                if (m[j][i] == -m[i][j]) {
                    contm++;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        if (contm == 9) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
