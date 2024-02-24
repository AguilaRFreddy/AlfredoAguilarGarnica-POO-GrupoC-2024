/*Realizar una clase llamada CalculadoraImpuestos que cuente con un método llamado calcularImpuestos.
Este método puede recibir hasta 4 parámetros, ingresos (int),
 porcentajeImpuestos (double), dividendos (double) y exención (double).
Si el usuario manda solo los ingresos, retornar ingresos + 0.15
Si el usuario manda ventas y porcentajeImpuesto retornar ventas * (porcentajeImpuesto / 100)
Si el usuario manda dividendos, porcentajeImpuesto y exención.
Calcular los impuestos = dividendos * (porcentajeImpuesto / 100)
Si los impuestos son mayores que la exención retornar los impuestos menos la exención, sino retornar 0. */
public class CalculadoraImpuestos {
    int ingresos;
    double porcentajeImpuestos,dividendos, exención, ventas;
    
    
    double calcularImpuestos(int ingresos){
      double impuestoTotal;
      impuestoTotal = ingresos + ingresos * 0.15;
      return impuestoTotal;  
    
    }
    double calcularImpuestos(double ventas,double porcentajeImpuestos){
        double impuestoTotal;
        impuestoTotal = ventas * (porcentajeImpuestos / 100);
        return impuestoTotal;  
    
    }
    double calcularImpuestos(double exención, double porcentajeImpuestos, double dividendos){
        double impuestoTotal;
        impuestoTotal = dividendos * (porcentajeImpuestos / 100);
        if (impuestoTotal<exención) {
            return 0;
        }
        impuestoTotal= impuestoTotal - exención;
         return  impuestoTotal;
    }
    
    
    }