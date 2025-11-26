package Ejercicio_3;

public class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String titulo, String contenido) {
        generador.generar(titulo, contenido);
    }
}
