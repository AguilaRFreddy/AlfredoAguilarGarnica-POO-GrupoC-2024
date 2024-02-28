
public class GetSet {
    public static void main(String[] args) throws Exception {
  
Producto Producto1 = new Producto("", 35);

System.out.println();

Producto1.setNombre("Refresco");
Producto1.setStock(40);
Producto1.reducirStock(15);
System.out.println("El producto: "+Producto1.getNombre());
System.out.println("cuesta: $" +Producto1.getPrecio());
System.out.println("Hay disponibles: "+Producto1.getStock());

System.out.println();

Producto Producto2 = new Producto("", 5,50);

Producto2.setNombre("Pan");
Producto2.reducirStock(15);
Producto2.aumentarStock(10);

System.out.println("El producto 2 es: "+Producto2.getNombre());
System.out.println("cuesta: $" +Producto2.getPrecio());
System.out.println("Hay disponibles: "+Producto2.getStock());
System.out.println();

    }
}
