
package entidad;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private int edad, salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese su salario actual");
        this.salario = leer.nextInt();
        System.out.println("Ingrese su edad");
        this.edad = leer.nextInt();
        if (this.edad < 30) {
            System.out.println("Tiene un 5% de aumento en su salario");
            System.out.println("Su salario actual es de " + (this.salario*5)/100);
        } else {
            System.out.println("Tiene un 10% de aumento en su salario");
            System.out.println("Su salario actual es de " + (this.salario*10)/100);
        }
    }
    
}
