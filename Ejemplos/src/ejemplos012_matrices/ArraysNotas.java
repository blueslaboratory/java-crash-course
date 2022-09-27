package ejemplos012_matrices;

import java.util.Scanner;

public class ArraysNotas {

	public static void main(String[] args) { 
		
		Scanner teclado = new Scanner(System.in);
		int numAlum, i;
		double suma = 0, media;

		do {
			System.out.print("Numero de alumnos de la clase: ");
			numAlum = teclado.nextInt();
		} while(numAlum <= 0);

		double[] notas = new double[numAlum];

		for(i=0; i<notas.length; i++) {
			do {
				System.out.print("Alumno " +(i+1) +" Nota final (0-10): ");
				notas[i] = teclado.nextDouble();
			} while(notas[i]<0 || notas[i]>10);
		}

		for(i=0; i<notas.length; i++)
			suma = suma + notas[i];

		media = suma/notas.length;
		
		System.out.printf("Nota media del curso: %2f %n", media);
		//printf con %2f te deja elegir los decimales: 2
		//%n funciona como \n
		System.out.println("Listado de notas superiores a la media: ");
		for(i=0; i<notas.length; i++)
			if(notas[i]>media)
				System.out.println("Alumno numero " +(i+1) +" Nota final: " + notas[i]);
		
		teclado.close();
	}

}
