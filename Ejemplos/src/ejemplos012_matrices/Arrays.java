package ejemplos012_matrices;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//Declaracion
		int [] ventas;
		
		//Instanciar (se guarda en RAM)
		ventas = new int[5]; 
		
		//De una vez
		int [] ventas2 = new int[5]; 
		double [] notas = {6.7, 7.5, 5.3, 8.75, 3.6, 6.5}; 
		String [] dias = {"Lunes", "Martes", "Miercoles", 
						  "Jueves", "Viernes", "Sabado", "Domingo"};
		
		System.out.println("Elementos en ventas: " +ventas.length);
		System.out.println(notas[notas.length -1]);
		//java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(notas[notas.length]);
		
		
		
		//Ejemplo para asignar un valor a un elemento del array que se lee por teclado:
		Scanner teclado = new Scanner(System.in); 
		int i, valor; 
		int [] a = new int[10]; 
		
		System.out.print("Posicion (0-9): "); 
		i = teclado.nextInt(); 
		
		System.out.print("Valor: "); 
		valor = teclado.nextInt(); 
		
		if (i>=0 && i<a.length) 
			a[i] = valor;
		
		System.out.println("Contenido de la posicion " +i +" del array es " +a[i]);
		
		
		
		//Recorrer un array unidimensional
		double[] notas2 = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0};
		
		System.out.print("Arrays notas2 impreso: ");
		for (i=0; i<notas2.length; i++) 
			System.out.print(notas2[i] + " ");
	}

}
