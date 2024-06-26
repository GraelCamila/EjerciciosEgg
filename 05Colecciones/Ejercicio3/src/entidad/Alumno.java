
package entidad;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", notas: " + notas;
    }
    
    
    
    
}
