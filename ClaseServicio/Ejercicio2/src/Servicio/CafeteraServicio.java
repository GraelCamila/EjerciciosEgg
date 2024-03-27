
package Servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera llenarCafetera(){
        Cafetera cafet = new Cafetera();
        cafet.setCapMax(1000);
        cafet.setCantActu(cafet.getCapMax());
        System.out.println("La cafetera se lleno (1000ml)");
        return cafet;
    }
    
    public void servirTaza(Cafetera cafet){
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza = leer.nextInt();
        if (taza > cafet.getCantActu() && cafet.getCantActu() >=1) {
            System.out.println("La cantidad actual (" +cafet.getCantActu()+ "ml) de cafe no llega a llenar la taza");
            System.out.println("Se sirvio "+ cafet.getCantActu() + "ml en la taza");
            cafet.setCantActu(0);
            System.out.println("La cafetera se vacio (0lm)");
        } else if (taza <= cafet.getCantActu() && cafet.getCantActu() >=1) {
            System.out.println("Se lleno la taza");
            cafet.setCantActu(cafet.getCantActu()-taza);
            System.out.println("La cantidad actual de la cafetera es de " + cafet.getCantActu() + "ml");
        } else {
            System.out.println("La cafetera esta vacia");
            System.out.println("No se pudo servir cafe en la taza");
        }
    }
    
    public void vaciarCafetera(Cafetera cafet){
        cafet.setCantActu(0);
        System.out.println("La cafetera se vacio (0ml)");
    }
    
    public void agregarCafe(Cafetera cafet){
        System.out.println("Ingresar una cantidad de cafe");
        int can = leer.nextInt();
        int nuCan = can + cafet.getCantActu();
        
        if (nuCan > cafet.getCapMax()) {
            System.out.println("La cantidad de cafe ingresada supera la capacidad maxima de la cafetera");
            System.out.println("Solo se añadio " + (cafet.getCapMax()-cafet.getCantActu()));
            cafet.setCantActu(cafet.getCapMax());
        } else if (nuCan == cafet.getCapMax()) {
            System.out.println("Se lleno la cafetera");
            cafet.setCantActu(cafet.getCapMax());
        } else {
            cafet.setCantActu(cafet.getCantActu() +can);
            System.out.println("La cantidad actual de la cafetera es " + cafet.getCantActu());
            System.out.println("Falta " + (cafet.getCapMax()-cafet.getCantActu()) + " para llenar la cafetera");
        }
    }
}
