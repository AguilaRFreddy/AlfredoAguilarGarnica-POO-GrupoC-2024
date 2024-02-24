import java.util.Scanner;

public class App {
      public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingresa 1 para calcular area y perimetro de un rectangulo");
        System.out.println("2 para calcular el sueldo de un empleado ");
        System.out.println("3 para calcular impuestos");
int caso;
caso = leer.nextInt();

switch(caso){

    case 1 :

        Rectangulo Rectangulo1 = new Rectangulo();
        
      String base,height;
      System.out.println("ingresa base: ");
      base = texto.nextLine();
      System.out.println("Ingresa altura " );
      height = texto.nextLine();
      for (int i = 0; i < base.length(); i++) {
        char numero = base.charAt(i);
        if (numero == '.') {
            double BaseDouble = Double.parseDouble(base);
            double heightDouble = Double.parseDouble(height);

         Rectangulo1.Area(BaseDouble, heightDouble);
         Rectangulo1.Perimetro(BaseDouble, heightDouble);
        }
      
    }
    for (int j = 0; j < height.length(); j++){
        char numero = base.charAt(j);
        if (numero == '.') {
            double BaseDouble = Double.parseDouble(base);
            double heightDouble = Double.parseDouble(height);

        }  
        
        int intBase =  Integer.parseInt(base);
        int intHeigth =  Integer.parseInt(height);
        
        Rectangulo1.area(intBase, intHeigth);
        Rectangulo1.Perimetro(intBase, intHeigth);
        }//lector altura 
        break;
        case 2:
Empleado empleado1 = new Empleado();


System.out.println("Ingresa salario");
double salarioBase = leer.nextDouble();

System.out.println("Desea ingresar bonificacion? ");
System.out.println("usa si o no");
String respuesta = texto.nextLine();
String respuestaMinusculas = respuesta.toLowerCase();

if (respuestaMinusculas.equals("si")) {
    System.out.println("Ingresa Bonificacion ");
    double bonificacion = leer.nextDouble();

    System.out.println("desea ingresar horas extra? ");
    String respuesta1 = texto.nextLine();
String respuestaMinusculas1 = respuesta1.toLowerCase();
    
if (respuestaMinusculas1.equals("si")) {
      System.out.println("Ingresa horas extra ");  
      int horas = leer.nextInt();
      empleado1.Sueldo(salarioBase,bonificacion,horas);
    }
    empleado1.Sueldo(salarioBase,bonificacion);
    
}else{
empleado1.Sueldo(salarioBase);
}
        break;
        case 3:
CalculadoraImpuestos impuestos1 = new CalculadoraImpuestos();
System.out.println("Que datos desea ingresar?");
System.out.println("1 Para ingresos");
System.out.println("2 Para ventas y porcentaje de impuestos ");
System.out.println("3 Para ventas, porcentaje de impuestos y execion ");
int opcion = leer.nextInt();
double TOTAL;

switch(opcion){
    
case 1:
int ingresos;
System.out.println("ingresa ingresos");
ingresos = leer.nextInt();

TOTAL = impuestos1.calcularImpuestos(ingresos);
System.out.println("El impuesto a pagar es "+ TOTAL);
break;

case 2:
double ventas,porcentajeImpuestos;
System.out.println("ingresa ventas ");
ventas = leer.nextDouble();
System.out.println("ingresa el porcentaje de impuestos ");
porcentajeImpuestos = leer.nextDouble();

TOTAL =impuestos1.calcularImpuestos(ventas,porcentajeImpuestos);
System.out.println("El impuesto a pagar es "+ TOTAL);
break;

case 3:
double ventas1,porcentajeImpuestos1,exención1;
System.out.println("ingresa ventas ");
ventas1 = leer.nextDouble();
System.out.println("ingresa el porcentaje de impuestos ");
porcentajeImpuestos1 = leer.nextDouble();
System.out.println("Ingresa exencion");
exención1 = leer.nextDouble();

TOTAL = impuestos1.calcularImpuestos(ventas1,porcentajeImpuestos1,exención1);
System.out.println("El impuesto a pagar es "+ TOTAL);

break;
default:
System.out.println("Opcion invalida");

}

        break;
        default:
System.out.println("Opcion invalida");

    }// del switch
    }//delMain

}//claseprincipal
