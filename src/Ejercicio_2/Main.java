package Ejercicio_2;

public class Main {
    public static void main(String[] args) {

        // Uso local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        gestor.guardar("nota.txt", "Hola mundo");
        gestor.leer("nota.txt");

        // Uso en la nube
        Almacenamiento nube = new AlmacenamientoNube();
        gestor = new GestorArchivos(nube);
        gestor.guardar("reporte.pdf", "Contenido del reporte");
        gestor.leer("reporte.pdf");
    }
}
