package Ejercicio_1;

public class Main {
    public static void main(String[] args) {

        // Autenticación local
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        gestor.iniciarSesion("admin", "1234");

        // Autenticación OAuth
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(oauth);
        gestor.iniciarSesion("usuario", "oauth");
    }
}
