//4.- Programa Java que lea por teclado 10 numeros enteros y 
//los guarde en un array. A continuacion, calcula y muestra por 
//separado la media de los valores positivos y la de los valores 
//negativos. 


package m1_unidimensionales;

import java.util.Scanner;

public class Ej004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = new int[10];
		int pos, neg;
		int cont1, cont2;
		pos = 0;
		neg = 0;
		cont1 = 0;
		cont2 = 0;
		
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Dime el numero para la posicion " +i +": ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Tu array es: ");
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i] +" ");
		
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>=0) {
				pos += array[i];
				cont1++;
			}
			else {
				neg += array[i];
				cont2++;
			}
		}
		
		if(cont1>0) 
			System.out.println("Media positivos: " +(pos/cont1));
			
		if(cont2>0) 
			System.out.println("Media negativos: " +(neg/cont2));
		
		sc.close();
	}

}
