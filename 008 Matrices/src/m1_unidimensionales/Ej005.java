//5.- Programa Java que lea 10 números enteros por teclado 
//y los guarde en un array. 
//Calcula y muestra la media de los números que estén en 
//las posiciones pares del array. Considerar la primera 
//posición del array (posición 0) como par. 

package m1_unidimensionales;

import java.util.Scanner;

public class Ej005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = new int[10];
		int sumPares, cont1;
		sumPares = 0;
		cont1 = 0;
		
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Dime el numero para la posicion " +i +": ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Tu array es: ");
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i] +" ");
		
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			if(i%2 == 0) {
				sumPares += array[i];
				cont1++;
			}
		}
		
		if(cont1>0) 
			System.out.println("Media posiciones pares: " +(sumPares/cont1));
		
		sc.close();
	}

}

