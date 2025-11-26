package Ejercicio_2;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Archivo subido a la nube: " + nombre);
    }

    @Override
    public String leerArchivo(String nombre) {
        return "Contenido descargado desde la nube del archivo: " + nombre;
    }
}
