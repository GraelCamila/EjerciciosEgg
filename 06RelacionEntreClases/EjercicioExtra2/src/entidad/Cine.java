
package entidad;

public class Cine {
    
    private String pelicula;
    private String[][] sala = new String[8][6];
    private int precioEntrada;

    public Cine() {
    }

    public Cine(String pelicula, String[][] sala, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }
    
    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
}
