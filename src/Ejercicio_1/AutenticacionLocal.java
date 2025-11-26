package Ejercicio_1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String clave) {
        return usuario.equals("admin") && clave.equals("1234");
    }
}
