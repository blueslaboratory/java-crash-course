//3. Haz un programa que cree un array cuyo tamaño se pedirá por 
//teclado y cuyo contenido serán números  aleatorios entre 1 y 300. 
//Posteriormente se creará otro array que guardará aquellos números 
//del primer array que acaben en un dígito que se indicará por 
//teclado (se debe controlar que se introduce un numero correcto). 
//Finalmente, mostrar por pantalla los dos arrays.

package m1_unidimensionales2;

import java.util.Scanner;

public class Ej003GuardarDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, digito, cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el size del array: ");
		size = Integer.parseInt(sc.nextLine());
		
		int [] a = new int[size];
		int [] b;
		
		for(i=0; i<a.length; i++) 
			a[i] = (int)((Math.random()*((300-1+1)+1))); //(M-N+1)+N
		
		
		do {
			System.out.print("Dime el digito en el que quieres que acabe el 2do array: ");
			digito = Integer.parseInt(sc.nextLine());
		}while(digito<0 || digito>9);
		
		for(i=0; i<a.length; i++) {
			if(a[i]%10 == digito)
				cont++;
		}
		
		
		b = new int[cont];
		
		for(i=a.length-1; i>=0; i--) {
			if(a[i]%10 == digito) {
				b[cont-1] = a[i];
				cont--;
			}
		}
		
		System.out.println();
		imprimirArray(a);
		imprimirArray(b);
		
		sc.close();
	}
	
	
	public static void imprimirArray(int [] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] +" ");
		
		System.out.println();
	}

}
