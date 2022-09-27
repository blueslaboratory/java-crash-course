//2. Haz un programa que cree un array de 10 posiciones de 
//números aleatorios entre 1 y 100. Posteriormente se pedirá 
//por teclado una posición y se mostrará en pantalla qué 
//valor tiene esa posición. 
//Math.random() → Devuelve un numero entre 0.0 y 1.0
//Math.floor(Math.random()*6) → Devuelve un numero entre 0 y 5

package m1_unidimensionales2;

import java.util.Scanner;

public class Ej002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = new int [10];
		int i, pos;
		
		for(i=0; i<a.length; i++) 
			a[i] = (int)((Math.random()*((100-1+1)+1))); //(M-N+1)+N
		
		
		do {
			System.out.print("Introduce la posicion a mostrar (0-9): ");
			pos = Integer.parseInt(sc.nextLine());
		}while(pos<0 || pos>9);
		
		System.out.println("Elemento en posicion " +pos +": " +a[pos]);
		
		sc.close();
	}

}
