package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej009_Pedir {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("Escribe un numero:");
		Scanner sc = new Scanner(System.in);
		// entrada de una cadena
		String respuesta = sc.nextLine();
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta Ejemplo2
		File directorio = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\Eclipse-workspace\\Ejemplos\\bin");

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "ejemplos036_procesos.Ej009_Calcular");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		// se ejecuta el proceso
		Process p = pb.start();

		respuesta = respuesta + "\n";
		OutputStream os = p.getOutputStream();
		os.write(respuesta.getBytes());
		os.flush(); // vacia el buffer de salida

		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (exitVal == 0) {
			// obtener la salida devuelta por el proceso
			try {
				// exitVal = p.waitFor();
				InputStream is = p.getInputStream();
				int c;
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
