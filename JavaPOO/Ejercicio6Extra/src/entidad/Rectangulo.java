
package entidad;

import java.util.Scanner;

public class Rectangulo {
    
    private int lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("El area del rectangulo es " + (this.lado1*this.lado2));
        
    }
    
}
