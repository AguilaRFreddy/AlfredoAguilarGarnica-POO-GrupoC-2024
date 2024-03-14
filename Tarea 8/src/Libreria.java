import java.util.ArrayList;
import java.util.List;

public class Libreria {
private List<Persona> personas;
    private List<Libro> libros;

    public Libreria() {
        this.personas = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    public void registrarPersona(String nombre) {
        personas.add(new Persona(nombre));
    }

    public void registrarLibro(String titulo) {
        libros.add(new Libro(titulo));
    }

    public void realizarRenta(Persona persona, Libro libro) {
        libro.setRentado(true);
        persona.rentarLibro(libro);
    }

    public List<Persona> listarUsuariosConLibros() {
        List<Persona> usuariosConLibros = new ArrayList<>();
        for (Persona persona : personas) {
            if (!persona.getLibrosRentados().isEmpty()) {
                usuariosConLibros.add(persona);
            }
        }
        return usuariosConLibros;
    }

    public List<Libro> listarLibrosNoRentados() {
        List<Libro> librosNoRentados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isRentado()) {
                librosNoRentados.add(libro);
            }
        }
        return librosNoRentados;
    }

    public List<Libro> listarLibrosRentados() {
        List<Libro> librosRentados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isRentado()) {
                librosRentados.add(libro);
            }
        }
        return librosRentados;
    }

    public void listarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
        }
    }

    public void listarLibros() {
        System.out.println("Libros registrados:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

}
