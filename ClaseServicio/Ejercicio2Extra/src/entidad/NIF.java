
package entidad;

public class NIF {
    
    private int DNIs;
    private char letra;

    public NIF() {
    }

    public NIF(int DNIs, char letra) {
        this.DNIs = DNIs;
        this.letra = letra;
    }

    public int getDNIs() {
        return DNIs;
    }

    public char getLetra() {
        return letra;
    }

    public void setDNIs(int DNIs) {
        this.DNIs = DNIs;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
}
