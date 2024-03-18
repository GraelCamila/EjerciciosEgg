
package guia4;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        int[][] m = new int[4][4];
        int al;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                al = (int) (Math.random()*2);
                if (al == 0) {
                    m[i][j] = (int) (Math.random()*-10);
                } else {
                    m[i][j] = (int) (Math.random()*10);
                }
            }
        }
        System.out.println("Matriz A");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] < 0) {
                    System.out.print(" |" + m[i][j]);
                } else {
                    System.out.print(" | " + m[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("Matriz B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[j][i] < 0) {
                    System.out.print(" |" + m[j][i]);
                } else {
                    System.out.print(" | " + m[j][i]);
                }
            }
            System.out.println("");
        }
    }
}
