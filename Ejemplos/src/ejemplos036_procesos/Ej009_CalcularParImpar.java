package ejemplos036_procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej009_CalcularParImpar {
	public static void main(String[] args) throws IOException, InterruptedException {

		// leyendo del buffer de Ej009_Pedir
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Integer numero;
		

		try {
			// numero = br.readLine();
			numero = Integer.parseInt(br.readLine());
			
			if (numero % 2 == 0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			
			// seteando exitVal
			System.exit(69);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			// seteando exitVal
			System.exit(-1);
		}
		
		br.close();
		isr.close();
	}
}
