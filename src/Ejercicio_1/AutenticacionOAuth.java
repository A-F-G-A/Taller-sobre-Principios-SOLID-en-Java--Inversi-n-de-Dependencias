package Ejercicio_1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando vía OAuth (Google/Facebook...)");
        return clave.equals("oauth");
    }
}
