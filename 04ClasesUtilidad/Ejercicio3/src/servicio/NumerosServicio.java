
package servicio;

import entidad.Numeros;
import java.util.Arrays;

public class NumerosServicio {
    
    public void inicializarA(Numeros num){
        for (int i = 0; i < num.getA().length; i++) {
            num.getA()[i] = (int) (Math.random()*20);
        }
        System.out.println("Numero A");
    }
    
    public void mostrar(Numeros num){
        for (int i = 0; i < num.getA().length; i++) {
            System.out.print(num.getA()[i]+", ");
        }
        System.out.println("");
    }
    
    public void ordenar(Numeros num){
        Arrays.sort(num.getA());
        System.out.println("Numero A ordenado: ");
        mostrar(num);
    }
    
    public void inicializarB(Numeros num){
        for (int i = 0; i < num.getB().length; i++) {
            if (i <= 10) {
                num.getB()[i]= num.getA()[i];
            }
        }
        Arrays.fill(num.getB(), 10, 20, 0.5);
        
        for (int i = 0; i < num.getB().length; i++) {
            System.out.print(num.getB()[i]+", ");
        }
        System.out.println("");
        
    }
}
