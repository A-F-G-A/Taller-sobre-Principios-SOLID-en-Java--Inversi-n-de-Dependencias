package Ejercicio_3;

public class Main {
    public static void main(String[] args) {

       // Generar PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestor = new GestorReportes(pdf);
        gestor.crearReporte("Informe Mensual", "Ventas aumentaron 20%.");
        
       /// Generar Excel
        GeneradorReporte excel = new ReporteExcel();
        gestor = new GestorReportes(excel);
        gestor.crearReporte("Datos del Año", "Listado completo de datos.");
    }
}
