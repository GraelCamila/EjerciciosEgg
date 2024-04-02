
package entidad;

public class Cadena {
    
    private String frase;
    private int lar;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.lar = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLar() {
        return lar;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLar(int lar) {
        this.lar = lar;
    }
    
    
}
