
package servicio;

import entidad.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ParDeNumeros par = new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println("Numero 1°: " + par.getNum1());
        System.out.println("Numero 2°: " + par.getNum2());
    }
    
    public double devolverMayor(){
        double a = par.getNum1();
        double b = par.getNum2();
        System.out.println("Mayor: " + Math.max(a, b));
        return Math.max(par.getNum1(), par.getNum2());
    }
    
    public void calcularPotencia(){
        double mayor = devolverMayor();
        System.out.println("mayor: " + mayor);
        double menor = (mayor == par.getNum1()) ? par.getNum2() : par.getNum1();
        System.out.println("menor: " + menor);
        double pot = Math.pow(Math.round(mayor), Math.round(menor));
        System.out.println("Potencia: " + pot);
    }
    
    public void calcularRaiz(){
        double menor = Math.min(par.getNum1(), par.getNum2());
        System.out.println("menor: " + menor);
        double raiz = Math.sqrt(Math.abs(menor));
        System.out.println("Raiz: " + raiz);
    }
    
}
