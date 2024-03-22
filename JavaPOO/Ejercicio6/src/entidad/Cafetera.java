
package entidad;

import java.util.Scanner;

public class Cafetera {

    private int capMax, cantActu;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera() {
    }

    public Cafetera(int capMax, int cantActu) {
        this.capMax = capMax;
        this.cantActu = cantActu;
    }

    public int getCapMax() {
        return capMax;
    }

    public int getCantActu() {
        return cantActu;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public void setCantActu(int cantActu) {
        this.cantActu = cantActu;
    }
    
    public void llenarCafetera(){
        this.cantActu = this.capMax;
    }
    
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza = leer.nextInt();
        
        if (taza > this.cantActu) {
            System.out.println("La cantidad actual de cafe no llega a llenar la taza");
            taza = (this.cantActu*taza)/100;
            System.out.println("Se sirvio solo el "+ ((this.cantActu*taza)/100) + "% de la taza");
        }
    }
    
    public void vaciarCafetera(){
        this.cantActu = 0;
    }
    
    public void agregarCafe(){
        System.out.println("Ingresar una cantidad de cafe");
        this.cantActu = leer.nextInt();
        
    }
}
