
package entidad;

public class Ahorcado {
    
    private int cantLetrasEncon, cantJugMax,n;
    private String[] palabra = new String[n];

    public Ahorcado() {
    }

    public Ahorcado(int cantLetrasEncon, int cantJugMax, int n, String[] palabra) {
        this.cantLetrasEncon = cantLetrasEncon;
        this.cantJugMax = cantJugMax;
        this.n = n;
        this.palabra = palabra;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantLetrasEncon() {
        return cantLetrasEncon;
    }

    public int getCantJugMax() {
        return cantJugMax;
    }

    public int getN() {
        return n;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantLetrasEncon(int cantLetrasEncon) {
        this.cantLetrasEncon = cantLetrasEncon;
    }

    public void setCantJugMax(int cantJugMax) {
        this.cantJugMax = cantJugMax;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
