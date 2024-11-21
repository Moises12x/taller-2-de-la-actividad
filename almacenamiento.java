public interface Almacenamiento {
    void guardar(String nombreArchivo, String contenido);
    String recuperar(String nombreArchivo);
}
public class AlmacenamientoLocal implements Almacenamiento;{

public void guardar(String nombreArchivo, String contenido) {
    almacenamiento.put(nombreArchivo, contenido);
    System.out.println("Archivo guardado" + nombreArchivo);
}
}
public String recuperar(String nombreArchivo){
    System.out.println("archivo encontrado")
}
public class AlmacenamientoNube implements Almacenamiento {
    public void guardar(String nombreArchivo, String contenido){
        System.out.println("archivo guardado en la nube")
    }
}
public class GestorArchivos {
    - Almacenamiento almacenamiento;
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamiento.guardar(nombreArchivo, contenido);
    }
    public void mostrarArchivo(String nombreArchivo) {
        System.out.println(almacenamiento.recuperar("nombre de archivo"));
    }