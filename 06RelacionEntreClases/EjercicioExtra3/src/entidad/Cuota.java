
package entidad;

import enums.FormaDePago;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cuota {
    
    private int numDeCuota, montoTotalCuota;
    private LocalDate fechaVencimiento;
    private ArrayList<Integer> pagado = new ArrayList();
    private FormaDePago formaDePago;
    private Polizas poliza;

    public Cuota() {
    }

    public Cuota(int numDeCuota, int montoTotalCuota, ArrayList<Integer> pagado, LocalDate fechaVencimiento, FormaDePago formaDePago, Polizas poliza) {
        this.numDeCuota = numDeCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.pagado = pagado;
        this.formaDePago = formaDePago;
    }

    public int getNumDeCuota() {
        return numDeCuota;
    }

    public void setNumDeCuota(int numDeCuota) {
        this.numDeCuota = numDeCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ArrayList<Integer> getPagado() {
        return pagado;
    }

    public void setPagado(ArrayList<Integer> pagado) {
        this.pagado = pagado;
    }
    
    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }
    
    
    
    
}
