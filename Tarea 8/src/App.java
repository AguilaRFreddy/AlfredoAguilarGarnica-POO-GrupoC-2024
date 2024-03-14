import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar libro");
            System.out.println("3. Realizar renta de un libro");
            System.out.println("4. Listar todos los usuarios registrados");
            System.out.println("5. Listar todos los libros registrados");
            System.out.println("6. Listar usuarios que han rentado al menos un libro");
            System.out.println("7. Listar libros no rentados");
            System.out.println("8. Listar libros rentados");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario:");
                    String nombreUsuario = scanner.next();
                    libreria.registrarPersona(nombreUsuario);
                    System.out.println("Usuario registrado exitosamente.");
                    break;
                case 2:
                    System.out.println("Ingrese el título del libro:");
                    String tituloLibro = scanner.next();
                    libreria.registrarLibro(tituloLibro);
                    System.out.println("Libro registrado exitosamente.");
                    break;
                case 3:
                    System.out.println("Seleccione el número del usuario:");
                    libreria.listarUsuarios();
                    int indexUsuario = scanner.nextInt();
                    System.out.println("Seleccione el número del libro:");
                    libreria.listarLibros();
                    int indexLibro = scanner.nextInt();
                    libreria.realizarRenta(libreria.listarUsuariosConLibros().get(indexUsuario - 1),
                            libreria.listarLibrosNoRentados().get(indexLibro - 1));
                    System.out.println("Renta realizada con éxito.");
                    break;
                case 4:
                    libreria.listarUsuarios();
                    break;
                case 5:
                    libreria.listarLibros();
                    break;
                case 6:
                    System.out.println("Usuarios que han rentado al menos un libro:");
                    for (Persona persona : libreria.listarUsuariosConLibros()) {
                        System.out.println(persona.getNombre());
                    }
                    break;
                case 7:
                    System.out.println("Libros no rentados:");
                    for (Libro libro : libreria.listarLibrosNoRentados()) {
                        System.out.println(libro.getTitulo());
                    }
                    break;
                case 8:
                    System.out.println("Libros rentados:");
                    for (Libro libro : libreria.listarLibrosRentados()) {
                        System.out.println(libro.getTitulo());
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 9);
   
}
}