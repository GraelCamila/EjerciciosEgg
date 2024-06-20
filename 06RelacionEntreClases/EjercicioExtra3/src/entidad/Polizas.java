
package entidad;

import enums.FormaDePago;
import enums.TipoCobertura;
import java.time.LocalDate;
import java.util.ArrayList;

public class Polizas {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio, fechaFin;
    private int montoTotalAsegurado, montoMaxGranizo;
    private boolean incluyeGranizo;
    private FormaDePago pago;
    private TipoCobertura tipoCobertura;
    private ArrayList<Integer> numPoliza = new ArrayList();
    private ArrayList<Integer> cantCuotas = new ArrayList();

    public Polizas() {
    }

    public Polizas(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, ArrayList<Integer> numPoliza, ArrayList<Integer> cantCuotas, int montoTotalAsegurado, int montoMaxGranizo, boolean incluyeGranizo, FormaDePago pago, TipoCobertura tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numPoliza = numPoliza;
        this.cantCuotas = cantCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.incluyeGranizo = incluyeGranizo;
        this.pago = pago;
        this.tipoCobertura = tipoCobertura;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Integer> getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(ArrayList<Integer> numPoliza) {
        this.numPoliza = numPoliza;
    }

    public ArrayList<Integer> getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(ArrayList<Integer> cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    
    
    
//    public void setCantCuotas(LocalDate fin, LocalDate inicio, FormaDePago formaDePago) {
//        ArrayList<Cuota> cuotas = new ArrayList();
//        for (int i = 0; i < Period.between(fin, inicio).getMonths(); i++) {
//            Cuota cuota = new Cuota();
//            cuota.setNumDeCuota(i+1);
//            cuota.setFechaVencimiento(inicio.plusMonths(i+1));
//            cuota.setFormaDePago(formaDePago);
//            cuota.setMontoTotalCuota(1000);
//            cuota.setPagado(false);
//        }
//    }
    
    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public FormaDePago getPago() {
        return pago;
    }

    public void setPago(FormaDePago pago) {
        this.pago = pago;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Polizas{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", numPoliza=" + numPoliza + ", montoTotalAsegurado=" + montoTotalAsegurado + ", montoMaxGranizo=" + montoMaxGranizo + ", incluyeGranizo=" + incluyeGranizo + ", pago=" + pago + ", tipoCobertura=" + tipoCobertura + ", cantCuotas=" + cantCuotas + ", cantidCuotas=" + '}';
    }
    
    
    
    
}
