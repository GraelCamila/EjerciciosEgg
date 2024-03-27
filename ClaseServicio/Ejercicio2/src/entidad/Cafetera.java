
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
    
    
    
}
