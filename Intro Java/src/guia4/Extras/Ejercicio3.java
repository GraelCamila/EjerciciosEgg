
package guia4.Extras;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int[] v = new int[10];
        vector(v);
        imprimir(v);
        
    }
    public static void vector(int[] v) {
        
        for (int i = 0; i < 10; i++) {
            v[i] = (int) (Math.random()*10);
        }
        
    }
    
    public static void imprimir(int[] v) {
        
        for (int i = 0; i < 10; i++) {
            if (i==9) {
                System.out.print(v[i]);
            } else {
                System.out.print(v[i] + " - ");
            }
        }
        System.out.println("");
    }
}
