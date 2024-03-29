package entregable3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> lista= new ArrayList<Integer>();
		int numero;
		 
		 for(int i=0; i<10; i++) {
			 numero=Integer.parseInt(br.readLine());
			 lista.add(numero);
		 }
		 
		 Collections.sort(lista);
		 
		 for(int i=0; i<lista.size(); i++) {
			 System.out.println(lista.get(i));
		 }
		 
		 System.exit(0);

	}
}