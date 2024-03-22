
package entidad;

import java.util.Scanner;

public class Operacion {
    
    private int num1, num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese le segundo numero");
        this.num2 = leer.nextInt();
    }

    public int sumar() {
        System.out.println("La suma entre los dos numeros es " + (this.num1+this.num2));
        return this.num1 + this.num2;
    }
    
    public int restar() {
        System.out.println("La resta entre los dos numeros es " + (this.num1 - this.num2));
        return this.num1 - this.num2;
    }
    
    public int multiplicar() {
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("No se puede multiplicar por 0");
            return 0;
        } else {
            System.out.println("La multiplicacion de los dos numeros es " + (this.num1*this.num2));
            return this.num1 * this.num2;
        }
    }
    
    public int dividir() {
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            System.out.println("El resultado de la division es " + (this.num1/this.num2));
            return num1/num2;
        }
        
    }
}
