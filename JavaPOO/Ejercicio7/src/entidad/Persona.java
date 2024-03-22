
package entidad;

import java.util.Scanner;

public class Persona {
    private String nombre, sexo;
    private int edad, peso, altura;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, int peso, int altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
        System.out.println("Ingresar el nombre");
        this.nombre = leer.next();
        int cont;
        do {
            cont = 0;
            System.out.println("Ingresar el sexo:");
            System.out.println("H (Hombre)");
            System.out.println("M (Mujer)");
            System.out.println("O (Otro)");
            this.sexo = leer.next();
            if (!this.sexo.equalsIgnoreCase("M") && !this.sexo.equalsIgnoreCase("H") && !this.sexo.equalsIgnoreCase("O")) {
                System.out.println("El sexo ingresado no es valido");
                System.out.println("Vuelva a intentarlo");
                cont++;
            }
        } while (cont!=0);
        
        System.out.println("Ingrese la edad");
        this.edad = leer.nextInt();
        
        System.out.println("Ingrese la altura");
        this.altura = leer.nextInt();
        
        System.out.println("Ingrese el peso en kg");
        this.peso = leer.nextInt();
    }
    
    public int calcularIMC(){
        if (this.peso/(altura^2) < 20 ) {
            System.out.println(this.nombre + " se encuentra debajo de su peso ideal");
            return -1;
        } else if (this.peso/(altura^2) >= 20 && this.peso/(altura^2) <= 25){
            System.out.println(this.nombre + " se encuentra dentro de su peso ideal");
            return 0;
        } else {
            System.out.println(this.nombre + " tiene sobrepeso");
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        if (this.edad >= 18) {
            System.out.println(this.nombre + " es mayor de edad");
            return true;
        } else {
            System.out.println(this.nombre + " es menor de edad");
            return false;
        }
    }
}
