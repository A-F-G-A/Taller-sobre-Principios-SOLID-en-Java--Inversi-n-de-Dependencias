package Ejercicio_2;

public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public void leer(String nombre) {
        String contenido = almacenamiento.leerArchivo(nombre);
        System.out.println(contenido);
    }
}
