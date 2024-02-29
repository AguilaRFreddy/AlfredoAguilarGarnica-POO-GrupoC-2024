# Clase Producto
La clase Producto modela un producto con las siguientes características:

## Atributos:

nombre: Una cadena de caracteres que representa el nombre del producto.
precio: Un valor decimal que indica el precio del producto.
stock: Un entero que representa la cantidad disponible en stock del producto.

**Constructores:**

Producto(String nombre, double precio, int stock): Inicializa un producto con nombre, precio y stock dados.
Producto(String nombre, double precio): Inicializa un producto con nombre y precio dados, estableciendo el stock inicial en cero.

**Métodos:**

getNombre(): Devuelve el nombre del producto. Si no se ha establecido un nombre, muestra un mensaje indicando que no se introdujo ningún nombre.
getPrecio(): Devuelve el precio del producto.
getStock(): Devuelve la cantidad disponible en stock del producto.
setNombre(String nombre): Establece el nombre del producto.
setPrecio(double precio): Establece el precio del producto, mostrando un mensaje de error si el precio es negativo.
setStock(int stock): Establece la cantidad en stock del producto, mostrando un mensaje de error si se intenta establecer un stock negativo.
aumentarStock(int cantidad): Aumenta el stock del producto en la cantidad especificada, si la cantidad es mayor que cero.
reducirStock(int cantidad): Reduce el stock del producto en la cantidad especificada, si la cantidad es mayor que cero y no supera el stock actual.

# Clase GetSet
La clase GetSet contiene un método main que demuestra el uso de la clase Producto mediante la creación de instancias de productos y la manipulación de sus atributos. En el método main, se llevan a cabo las siguientes acciones:

Se crean dos instancias de Producto.
Se establecen nombres y stocks para los productos.
Se realizan operaciones de reducción y aumento de stock.
Se imprime la información de los productos en la salida estándar.
