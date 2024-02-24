public class rectangulo {
    double altura;
    double base;
    public rectangulo(double altura, double base){
        this.base = base;
        this.altura = altura;
    
    }
    void Perimetro(){
        double contorno = 2*altura + 2*base;
        System.out.println(contorno);
    }
    void Area(){
        double relleno = base*altura;
        System.out.println(relleno);
    }
    }
