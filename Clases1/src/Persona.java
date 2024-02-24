public class Persona {
      
    String nombre;
    String genero;
    int edad;
   public Persona(String nombre,String genero, int edad){
      this.nombre = nombre;
      this.genero = genero;
      this.edad = edad;
       
   }
    
   void resultados(){
   System.out.println("nombre es "+nombre ); 
   System.out.println("genero es "+ genero);
   System.out.println("edad es"+ edad);   
   
}
}