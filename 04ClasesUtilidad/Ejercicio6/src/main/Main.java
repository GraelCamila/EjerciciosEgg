
package main;

import servicio.CursoServicio;

public class Main {
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        
        cs.crearCurso();
        cs.calcularGananciaSemanal();
    }
}
