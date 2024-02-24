/*Crear una clase llamada Rectangulo la cual pueda calcular el área y el perimetro.
 Debes de considerar que el usuario puede ingresarte enteros o doubles, 
por lo que debes utilizar la sobrecarga de métodos para que existan funciones con el
 mismo nombre pero realicen una función diferente. */
 
 public class Rectangulo {
    double base, height;


public void area(int base , int  height){
    int area = base * height;
    System.out.println("El area de base " + base + " y altura " + height + " es: "+ area);
    } 

    public void Perimetro(int base , int  height){
        int perimetro = 2*base + 2*height;
        System.out.println("El perimetro de base " + base + " y altura " + height + " es: "+ perimetro);
        }


public void Area(double base , double  height){
    double area = base * height;
    System.out.println("El area de base " + base + " y altura " + height + " es: "+ area);
    }
    
    public void Perimetro(double base , double  height){
        double perimetro = 2*base + 2*height;
        System.out.println("El perimetro de base " + base + " y altura " + height + " es: "+ perimetro);
        }
   
}
