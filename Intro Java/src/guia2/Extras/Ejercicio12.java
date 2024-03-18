
package guia2.Extras;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        String a,b,c;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    c = k + "";
                    a = i + "";
                    b = j + "";
                    if (i == 3) {
                        a = "E";
                    }if (j == 3) {
                        b = "E";
                    }if (k == 3) {
                        c = "E";
                    }
                    System.out.println(a+"-"+b+"-"+c);
                }
            }
        }
        
    }
}
