//7.- Haz un programa que cree un array de números 
//y otro de String de un número de  elementos que 
//pondrás en una constante, que contendrán:
//
//El primero, notas entre 0 y 10 (debemos controlar 
//que inserte una nota válida), pudiendo tener decimales.
//
//En el segundo, se insertarán los nombres de alumnos.
//
//Después, se creará un tercer array de Strings, donde 
//se insertará la nota en forma de cadena, de la siguiente 
//forma:
//
//Si la nota está entre 0 y 4,99 , será un suspenso 
//Si está entre 5 y 6,99 , será un bien. 
//Si está entre 7 y 8,99 será un notable. 
//Si está entre 9 y 10 será un sobresaliente. 
//
//Finalmente, mostrar por pantalla el nombre de cada alumno, 
//su nota numérica y su nota alfabética usando los tres arrays.


package m1_unidimensionales;

import java.util.Scanner;

public class Ej007Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, i;
		
		do {
			System.out.print("Dime el size de los arrays: ");
			size = Integer.parseInt(sc.nextLine());
		}while(size<0);
		
		double [] notas = new double[size];
		String [] nombres = new String[size];
		String [] notaCad = new String[size];
		
		for(i=0; i<size; i++) {
			do {
				System.out.print("Introduce la nota " +(i+1) +": ");
				notas[i] = Double.parseDouble(sc.nextLine());
			}while(notas[i]<0 || notas[i]>10);
			
			
			System.out.print("Dime el nombre del alumno: ");
			nombres[i] = sc.nextLine();
			
			
			if(notas[i]>=0 && notas[i]<5)
				notaCad[i] = "suspenso";
			else if(notas[i]>=5 && notas[i]<7)
				notaCad[i] = "bien";
			else if(notas[i]>=7 && notas[i]<9)
				notaCad[i] = "notable";
			else
				notaCad[i] = "sobresaliente";
		}
		
		
		for(i=0; i<size; i++) {
			System.out.println(nombres[i] +" " +notaCad[i] +" " +notas[i]);
		}
		
		sc.close();
	}
}
