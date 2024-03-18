
package guia4;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 100 - i;
            System.out.println(vector[i]);
        }
    }
}
