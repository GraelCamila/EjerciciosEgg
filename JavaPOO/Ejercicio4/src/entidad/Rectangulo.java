
package entidad;

import java.util.Scanner;

public class Rectangulo {
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextInt();
    }
    
    public void superficie(){
        System.out.println("La superficie del rectangulo es " + (this.base*this.altura));
    }
    
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es " + ((this.base + this.altura)*2));
    }
    
    public void dibujar(){
        System.out.println("");
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
