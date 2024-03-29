/*
2.- Realiza un programa en java con las siguientes clases:
    - Vivienda: 
            + Atributos: metros cuadrados, calle y numero.
            + Metodos para devolver/establecer valores a los atributos.
            + Constructor con valores por defecto (0,â€�â€�,0)
            + Constructor con valores para los atributos
    - Chalet: Una vivienda que siempre tiene 120m2 y puede 
    		  o no tener jardin (verdadero o falso)
    - Palacio: Una vivienda de la que interesa el numero de habitaciones.

En el programa principal se mostrara el siguiente menu:

1. Insertar vivienda
2. Insertar chalet
3. Insertar palacio
4. Mostrar viviendas
5. Mostrar palacios
6. Borrar vivienda
7. Salir

Elija opcion: 


En las tres primeras opciones nos pediran los datos de 
cada tipo de vivienda (el tipo general corresponde a una 
vivienda que no es ni chalet ni palacio).
En la cuarta opcion se mostraran todas las viviendas de 
cualquier tipo.
En la quinta opcion se mostraran los datos de los palacios.
En la sexta opcion se pide el nombre de la calle y el numero 
de la vivienda a borrar y la eliminamos de la lista.

Un arrayList en otra clase ya
*/

package herencia1_Ej002Viviendas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej002Viviendas {
	private ArrayList<Ej002Vivienda> viviendas;
	
	//OTROS METODOS
	public void add(Ej002Vivienda f) {
		viviendas.add(f);
	}
	
	//4
	public void printViviendas() {
		//System.out.println(viviendas);
		Iterator<Ej002Vivienda> it = viviendas.iterator();
		while(it.hasNext()) {
			Ej002Vivienda v = it.next();
			System.out.println(v);
		}
	}
	public void printViviendas2() {
		//System.out.println(viviendas);
		for(Ej002Vivienda v: viviendas) {
			System.out.println(v);
		}
	}
	
	//5
	public void printPalacios() {
		Iterator<Ej002Vivienda> it = viviendas.iterator();
		while(it.hasNext()) {
			Ej002Vivienda v = it.next();
			if (v instanceof Ej002Palacio)
				System.out.println(v);
		}
	}
	public void printPalacios2() {
		for(Ej002Vivienda v: viviendas) {
			if (v instanceof Ej002Palacio)
				System.out.println(v);
		}
	}
	//6
	public void borrarVivienda(Scanner sc) {
		int opcion;
		
		System.out.println("Hay " +viviendas.size() +" viviendas");
		System.out.print("Remover vivienda en la posicion: ");
		opcion = Integer.parseInt(sc.nextLine());
		
		viviendas.remove(opcion-1);//Arraylist empieza por 0
	}
	
	
	//CONSTRUCTOR
	public Ej002Viviendas() {
		viviendas = new ArrayList<Ej002Vivienda>();
	}
	
	//GETTERS
	public ArrayList<Ej002Vivienda> getViviendas() {
		return viviendas;
	}
}
 