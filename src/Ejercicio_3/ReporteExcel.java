package Ejercicio_3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String titulo, String contenido) {
        System.out.println("Generando reporte Excel...");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
    }
}
