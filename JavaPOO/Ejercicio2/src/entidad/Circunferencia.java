
package entidad;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int radio;

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crerCircunferencia(){
        System.out.println("Ingrese el radio del circulo");
        this.radio = leer.nextInt();
    }
    
    public void area(){
        //forma 1:
        double area =(Math.PI * radio) / 2;
        //forma 2:
        double a = Math.PI * (Math.pow(this.radio, 2));
        System.out.println("El area del circulo es " + area);
    }
    
    public void perimetro(){
        //forma 1:
        double perimetro = 2*Math.PI*radio;
        //forma 2:
        double p = Math.PI * this.radio * 2;
        System.out.println("El perimetro del circulo es " + perimetro);
    }
}
