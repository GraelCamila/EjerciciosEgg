
package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingresar el nombre");
        persona.setNombre(leer.next());
        int cont;
        do {
            cont = 0;
            System.out.println("Ingresar el sexo:");
            System.out.println("H (Hombre)");
            System.out.println("M (Mujer)");
            System.out.println("O (Otro)");
            persona.setSexo(leer.next().toUpperCase().charAt(0));
            if (persona.getSexo()!='M' && persona.getSexo()!='H' && persona.getSexo()!='O') {
                System.out.println("El sexo ingresado no es valido");
                System.out.println("Vuelva a intentarlo");
                cont++;
            }
        } while (cont!=0);
        
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura");
        persona.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese el peso en kg");
        persona.setPeso(leer.nextInt());
        
        return persona;
    }
    
    public int calcularIMC(Persona persona){
        double IMC = persona.getPeso()/Math.pow(persona.getAltura(), 2);
        if (IMC < 20 ) {
            System.out.println(persona.getNombre() + " se encuentra debajo de su peso ideal");
            return -1;
        } else if (IMC <= 25){
            System.out.println(persona.getNombre() + " se encuentra dentro de su peso ideal");
            return 0;
        }
        System.out.println(persona.getNombre() + " tiene sobrepeso");
        return 1;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        if (persona.getEdad() >= 18) {
            System.out.println(persona.getNombre() + " es mayor de edad");
            return true;
        } else {
            System.out.println(persona.getNombre() + " es menor de edad");
            return false;
        }
    }
}

