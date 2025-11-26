package Ejercicio_2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {

    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo guardado localmente: " + nombre);
    }

    @Override
    public String leerArchivo(String nombre) {
        return archivos.getOrDefault(nombre, "Archivo no encontrado");
    }
}
