//1. Haz un programa que rellene un array con los 100 
//primeros números enteros y los muestre en pantalla en 
//orden inverso al orden en que se han introducido 
//(orden inverso).

package m1_unidimensionales2;

public class Ej001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[100];
		
		for(int i=0; i<a.length; i++)
			a[i] = i;
		
		for(int i=a.length-1; i>=0; i--)
			System.out.print(a[i] +" ");
			
	}

}
