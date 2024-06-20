
package entidad;

import enums.Color;
import enums.Tipo;

public class Vehiculo {
    private Tipo tipo;
    private Color color;
    private String marca, chasis, modelo;
    private int anio, numMotor;

    public Vehiculo() {
    }

    public Vehiculo(Tipo tipo, Color color, String marca, String chasis, String modelo, int anio, int numMotor) {
        this.tipo = tipo;
        this.color = color;
        this.marca = marca;
        this.chasis = chasis;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + ", color=" + color + ", marca=" + marca + ", chasis=" + chasis + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + '}';
    }
    
    
    
    
}
