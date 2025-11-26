package Ejercicio_3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String titulo, String contenido) {
        System.out.println("Generando reporte PDF...");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
    }
}
