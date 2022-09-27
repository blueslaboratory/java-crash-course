//3.- Escribe el código en Java de los siguientes ejercicios:
//
//Tienen que ser static.
//
//a) El método public int cuentaCeros ( int arr[ ] ) que 
//recibe un array de enteros y devuelve el número de ceros 
//que se encuentran dentro del array. 
//
//b) El método public int sumaPares ( int arr[ ] ) que recibe 
//un array de enteros y devuelve el resultado de sumar sólo los 
//números pares que hay dentro del array. 
//
//c) El método public int cuentaRepeticiones ( int arr[ ], int x ) 
//que recibe un array de enteros y un valor entero x. El método 
//devuelve el número de veces que se repite el valor de x en el array. 
//
//d) El método public void sustituye (int arr[ ], int viejo, int nuevo) 
//que recibe un array de enteros y dos valores enteros viejo y nuevo. 
//El método debe reemplazar todos los valores viejo del array por el 
//valor de nuevo.
//
//e) El método public void intercambia (int arr[ ], int x, int y), 
//que recibe un array de enteros y dos valores enteros que corresponden 
//a dos componentes del array e intercambie los valores de las componentes 
//del array. El ejercicio se hará teniendo en cuenta que x e y son el 
//contenido de dos posiciones del array y después se hará teniendo en 
//cuenta que x e y son las posiciones del array. 
//
//f) El método public void invierte (int arr[ ]), que recibe un array 
//de enteros e invierte la secuencia de valores del array.
//
//g) El procedimiento public void rotaDerecha (int arr[ ]), que recibe 
//un array de enteros y mueve a cada elemento una posición adelante, 
//colocando el último valor del array en la primera componente del array 
//resultante.
//
//h) El método public boolean iguales (int a1[ ], int a2[ ]), que recibe 
//dos arrays de enteros y devuelve true si los dos arrays contienen la 
//misma secuencia de valores y false de otra manera. 


package m1_unidimensionales;

import java.util.Scanner;

public class Ej003Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.print("Dime el size de los arrays: ");
		size = Integer.parseInt(sc.nextLine());
		
		int [] array = new int[size];
		int [] array2 = new int[size];
		
		arrayAleatorio(array);
		arrayAleatorio(array2);
		
		imprimirArray(array);
		imprimirArray(array2);
		
		System.out.println("a. Ceros: " +cuentaCeros(array));
		System.out.println("b. Suma Pares: " +sumaPares(array));
		System.out.println("c. Cuenta repeticiones: " +cuentaRepeticiones(array, 5));
		System.out.println("d. Sustituye: ");
		sustituye(array, 0, 9);
		System.out.println("e. Intercambia: ");
		intercambia(array, 0, 9);
		System.out.println("e. Intercambia2: ");
		intercambia2(array, 0, 3);
		System.out.println("f. Invierte: ");
		invierte(array);
		System.out.println("g. Rota dcha: ");
		rotaDerecha(array);
		System.out.println("h. Son iguales a[1] y a[2]: " +((iguales(array, array2)) ? "si" : "no"));
		
		sc.close();
	}
	
	public static void imprimirArray(int [] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] +" ");
		
		System.out.println();
	}
	
	public static void arrayAleatorio(int [] a) {
		for (int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*((10-1)+1)); //1-10: (Math.random()*(M-N+1)+N)
		}
	}
	
	//a)
	public static int cuentaCeros(int a[]) {
		int ceros = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] == 0)
				ceros++;
		}
		
		return ceros;
	}
	
	//b)
	public static int sumaPares(int a[]) {
		int suma = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i]%2 == 0)
				suma += a[i];
		}
		
		return suma;
	}
	
	//c)
	public static int cuentaRepeticiones(int a[], int x) {
		int rep = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] == x)
				rep++;
		}
		
		return rep;
	}
	
	//d)
	public static void sustituye(int a[], int viejo, int nuevo) {
		for (int i=0; i<a.length; i++) {
			if (a[i] == viejo)
				a[i] = nuevo;
		}
		
		imprimirArray(a);
	}
	
	//e)
	public static void intercambia(int a[], int x, int y) {
		for (int i=0; i<a.length; i++) {
			if (a[i] == x)
				a[i] = y;
			else if (a[i] == y)
				a[i] = x;
		}
		
		imprimirArray(a);
	}
	
	public static void intercambia2(int a[], int x, int y) {
		int swap;
		
		swap = a[x];
		a[x] = a[y];
		a[y] = swap;
		
		imprimirArray(a);
	}
	
	//f
	public static void invierte(int a[]) {
		int [] b = new int[a.length];
		int i;
		
		for (i=0; i<a.length; i++) {
			b[a.length-i-1] = a[i]; 
		}
		
		for (i=0; i<a.length; i++) {
			a[i] = b[i]; 
		}
		
		imprimirArray(a);
	}
	
	//g
	public static void rotaDerecha(int a[]) {
		int [] b = new int[a.length];
		int i;
		
		for (i=0; i<a.length; i++) {
			if (i<a.length-1)
				b[i+1]=a[i];
			else
				b[0] = a[a.length-1];
		}
		
		for (i=0; i<a.length; i++){
			a[i] = b[i]; 
		}
		
		imprimirArray(a);
	}
	
	//h
	public static boolean iguales(int a1[], int a2[]) {
		boolean flag = true;
		
		for (int i=0; i<a1.length; i++) {
			if(a1[i] != a2[i])
				flag = false;
		}
		
		return flag;
	}
}
