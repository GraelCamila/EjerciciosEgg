
package entidad;

public class Alumno {
    
    private String nombre;
    private int DNI, cantVotos;

    public Alumno() {
    }

    public Alumno(String nombre, int DNI, int cantVotos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", DNI=" + DNI;
    }
    
    
    
    
}
