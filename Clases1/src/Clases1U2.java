public class Clases1U2 {
    public static void main(String[] args) throws Exception {
        Persona Persona1 = new Persona("Juan", "Masculino", 10);
        
        Persona Persona2 = new Persona("Juana", "femenino", 30);
       
        Persona Persona3 = new Persona("Xuan", "Masculino", 45);
        
        Persona Persona4 = new Persona("Jose", "Masculino", 23);

        Persona1.resultados();
        Persona2.resultados();
        Persona3.resultados();
         Persona4.resultados();

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();

        libro2.titulo = "librero";
        libro2.autor  = "jose";
        libro2.año = 2004;
        
        libro3.titulo = "libra";
        libro3.autor  = "Pepe";
        libro3.año = 2005;

        libro4.titulo = "librito";
        libro4.autor  = "Pedro";
        libro4.año = 2006;

       libro1.mostrarLibro();
       libro2.mostrarLibro();
       libro3.mostrarLibro();
       libro4.mostrarLibro();

       rectangulo rectangulo1 = new rectangulo(5, 04);
       rectangulo rectangulo2 = new rectangulo(6, 05);
       rectangulo rectangulo3 = new rectangulo(7, 06);
       rectangulo rectangulo4 = new rectangulo(8, 07);

       rectangulo1.Perimetro();
       rectangulo2.Perimetro();
       rectangulo3.Perimetro();
       rectangulo4.Perimetro();

rectangulo1.Area();
rectangulo2.Area();
rectangulo3.Area();
rectangulo4.Area();

    }
}