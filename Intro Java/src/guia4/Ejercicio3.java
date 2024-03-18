
package guia4;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int[] vec = new int[1000];
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = random.nextInt(99999);
            System.out.println(vec[i]);
        }
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]<9) {
                cont1++;
            } else if (vec[i] <= 99) {
                cont2++;
            } else if (vec[i] >=100 && vec[i] <=999) {
                cont3++;
            } else if (vec[i] >=1000 && vec[i] <=9999) {
                cont4++;
            } else {
                cont5++;
            }
        }
        
        System.out.println("Dentro del vector hay:");
        System.out.println(cont1 + " de un solo digito");
        System.out.println(cont2 + " de dos digitos");
        System.out.println(cont3 + " de tres digitos");
        System.out.println(cont4 + " de cuatro digitos");
        System.out.println(cont5 + " de cinco digitos");
    }
}
