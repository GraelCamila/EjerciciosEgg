
package entidad;

public class Persona {
    
    private String nombre, apellido;
    private int edad, DNI;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int DNI, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        System.out.println("PERSONA:");
        return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", DNI: " + DNI;
    }
}
