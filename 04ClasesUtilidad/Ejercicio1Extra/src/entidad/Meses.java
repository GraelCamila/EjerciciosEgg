
package entidad;

public class Meses {

    private String[] meses = new String[12];
    private String mesSecreto;

    public Meses() {
    }

    public Meses(String mesSecreto, String[] meses) {
        this.mesSecreto = mesSecreto;
        this.meses = meses;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
}
