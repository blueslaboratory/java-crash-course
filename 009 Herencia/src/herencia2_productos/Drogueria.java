/*
1.- Disena una jerarquia de clases para los diferentes productos que 
se pueden encontrar en un supermercado (Alimentacion, Drogueria y Textil). 
Todos tienen un conjunto de caracteristicas comunes (codigo, nombre y precio) 
y una serie de caracteristicas especificas de cada producto. Los productos 
de alimentacion tienen fecha de caducidad (no se podra introducir un 
producto si la fecha de caducidad es anterior a la fecha actual, en ese 
caso lanza la excepcion propia FechaNoValidaException), los de drogueria 
tienen marca y los de textil color. 

La fecha sera introducida por el usuario pidiendole dia, mes y ano por 
separado (haras un paquete externo al proyecto, llamado utilidadesFecha 
con una clase llamada ValidacionFecha que tendra un metodo que reciba 
dia, mes y ano y devuelva si es correcta la fecha, una fecha en formato 
LocalDate y en caso contrario una excepcion denominada FechaNoValidaException)
https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
--suponer que el usuario siempre mete las cosas bien

El codigo debe adaptarse a un tamano de 5 caracteres de los cuales el 
primero y el ultimo son letras en mayuscula y el resto numeros. Utiliza 
expresiones regulares para controlarlo, lanzando una excepcion CodigoInvalidoException 
que crearas si no cumple la notacion.
//con los codigos de las letras ASCII se puede hacer sin excepciones

Crea un carrito de la compra en el que se pueden incluir productos y emitir 
un ticket en el que figuren los datos de cada producto del carrito, incluyendo 
su precio y el importe total de la compra. Si se quiere mas de una unidad de 
un producto, se pide varias veces, para simplificar.

Para ello, el programa al arrancar mostrara el menu:


PROCESO DE CREACIoN DEL ALMACeN

	1. Introducir producto alimenticio
	2. Introducir producto textil
	3. Introducir producto drogueria
	4. Terminar.
Elija opcion:


Con ese menu, se creara un arraylist con varios productos para poder simular 
los productos de un supermercado y poder hacer compras.

Entonces empezara el proceso de compras, mostrando para cada cliente el listado 
de productos y pidiendo al cliente que seleccione el producto que quiere comprar 
por nombre, hasta que ya no quiera mas productos. En ese momento, se procede 
imprimir el ticket con los distintos productos y el precio total a pagar.


Para cada cliente nuevo se visualizara lo siguiente:

¡¡¡¡Acaba de entrar en el supermercado virtual!!!!
               Lista de productos
1 Nombre:peras Precio:2.0 fecha caducidad alimento:23/2/1989
2 Nombre:toalla Precio:8.0 Color:azul
3 Nombre:gel Precio:2.0 Marca:Legrain

Desea comprar producto?(S/N)

Cuando el cliente termine (responde N), se calcula el importe de su compra y se 
empieza con un nuevo cliente (previamente se pregunta si hay un nuevo cliente)

Cuando no haya mas clientes, terminaremos la ejecucion del programa.


Esquema del proyecto (lector lo puedes importar como paquete externo y no 
incluirlo en el proyecto):

*/

package herencia2_productos;

public class Drogueria extends Producto{
	private String marca;

	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Drogueria() {}
	public Drogueria(Producto p, String marca) {
		super(p);
		this.marca = marca;
	}
	public Drogueria(String nombre, String codigo, double precio, String marca) {
		super(nombre, codigo, precio);
		this.marca = marca;
	}
	
	
	//GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		String s = super.toString();
		return s + "\tMarca: " + marca;
	}
	
	
}