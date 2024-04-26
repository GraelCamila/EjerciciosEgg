
package entidad;

public class Carta {
    
    private int num;
    private String palo;

    public Carta() {
    }

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public String getPalo() {
        return palo;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return num + " de " + palo;
    }
    
    
}
