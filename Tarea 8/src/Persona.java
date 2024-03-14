import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Libro> librosRentados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.librosRentados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void rentarLibro(Libro libro) {
        librosRentados.add(libro);
    }

}
