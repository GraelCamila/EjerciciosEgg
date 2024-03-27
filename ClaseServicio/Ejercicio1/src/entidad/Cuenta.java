
package entidad;

import java.util.Scanner;

public class Cuenta {

    private int numCuenta, DNI, saldoActual;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int DNI, int saldoActual) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    
}
