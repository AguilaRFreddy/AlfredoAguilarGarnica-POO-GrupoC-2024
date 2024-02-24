/*Crear una clase Empleado y crear métodos llamados calcularSalario para poder calcular el salario de la persona.
El /
 Los métodos pueden recibir hasta 3 parámetros: sueldoBase, bonificación y horas extras.
Si el usuario manda por parámetro solo el sueldo, retornar solo eso.
Si el usuario manda por parámetro sueldo y bonificación, retornar sueldo + bonificación.
Si el usuario manda por parámetro sueldo, bonificación y horas extras, retornar sueldo + bonificación + (horas * 20)
Todos los métodos deben de llamarse igual por lo que tienes que usar la sobrecarga de métodos */
public class Empleado {
    double sueldoBase,bonificación;
    int horas;
    public void Sueldo(double sueldoBase){
    System.out.println("El sueldo total es " + sueldoBase);
    }
    public void Sueldo(double sueldoBase, double bonificación){
       double total = sueldoBase + bonificación; 
       System.out.println("El sueldo base fue: " + sueldoBase + " y la bonificacion fue: "+
        bonificación + "Por lo que el TOTAL ES: "+ total);
    }
    public void Sueldo(double sueldoBase, double bonificación, int horas){
        double total, extra;
        extra = horas*20;
        total = sueldoBase + bonificación + extra;
        System.out.println("El sueldo base fue: " + sueldoBase + " y la bonificacion fue: "+
        bonificación + "las horas extra fueron "+ horas +  "Por lo que el TOTAL ES: "+ total);
    }
    }