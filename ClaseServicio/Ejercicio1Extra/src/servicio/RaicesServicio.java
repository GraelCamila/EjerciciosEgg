
package servicio;

import entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public double getDiscriminante(Raices raices){
        raices.setA(2);
        raices.setB(4);
        raices.setC(15);
        return Math.pow(raices.getB(),2)-4*raices.getA()*raices.getC();
    }
    
    public boolean tieneRaices(Raices raices){
        return getDiscriminante(raices) >= 0;
    }
    
    public boolean tieneRaiz(Raices raices){
        return getDiscriminante(raices) == 0;
    }
    
    public void obtenerRaices(Raices raices){
        if (tieneRaices(raices)) {
            double discriminante = Math.sqrt(getDiscriminante(raices));
            double raiz1 = (-raices.getB() + discriminante) / (2 * raices.getA());
            double raiz2 = (-raices.getB() - discriminante) / (2 * raices.getA());
            System.out.println("Las dos raíces son: " + raiz1 + " y " + raiz2);
        }
    }
    
    public void obtenerRaiz(Raices raices){
        if (tieneRaiz(raices)) {
            double raiz = -raices.getB() / (2 * raices.getA());
            System.out.println("La única raíz es: " + raiz);
        }
    }
    
    public void calcular(Raices raices){
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay solución real para esta ecuación.");
        }
    }
    
}
