
package guia2.Extras;

public class Ejercicio2 {
    public static void main(String[] args) {
        int A,B,C,D,aux;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        
    }
    
}
