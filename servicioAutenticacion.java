public interface servicioAutenticacion {
    boolean autenticar(String usuario, String credenciales);
}
public class AutenticacionLocal implements ServicioAutenticacion {
    public boolean autenticar(String usuario, String credenciales)
}
public class AutenticacionOAuth implements ServicioAutenticacion {
    public boolean autenticar(String usuario, String credenciales)
}
public class GestorAutenticacion {
    public class GestorAutenticacion {
        - final ServicioAutenticacion servicio;
        public GestorAutenticacion(ServicioAutenticacion servicio) {
            this.servicio = servicio;
        }
        public boolean login(String usuario, String credenciales);
        
    }
}