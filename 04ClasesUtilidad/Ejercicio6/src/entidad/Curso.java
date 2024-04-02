
package entidad;

public class Curso {

    private String nombreCurso, turno;
    private int cantHorasxDia, cantDiasxSemana, precioxHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantHorasxDia, int cantDiasxSemana, int precioxHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantHorasxDia = cantHorasxDia;
        this.cantDiasxSemana = cantDiasxSemana;
        this.precioxHora = precioxHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public int getCantHorasxDia() {
        return cantHorasxDia;
    }

    public int getCantDiasxSemana() {
        return cantDiasxSemana;
    }

    public int getPrecioxHora() {
        return precioxHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCantHorasxDia(int cantHorasxDia) {
        this.cantHorasxDia = cantHorasxDia;
    }

    public void setCantDiasxSemana(int cantDiasxSemana) {
        this.cantDiasxSemana = cantDiasxSemana;
    }

    public void setPrecioxHora(int precioxHora) {
        this.precioxHora = precioxHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
