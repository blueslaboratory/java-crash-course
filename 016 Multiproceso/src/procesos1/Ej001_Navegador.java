package procesos1;

import java.io.IOException;
// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej001_Navegador {

	static int retorno = -2;// En caso de que se haya ejecutado correctamente devolverá 0

	public static void main(String[] args) throws IOException, InterruptedException {

		String cadena = JOptionPane.showInputDialog("Introduce una Url");
		// Scanner entrada = new Scanner(System.in);
		// System.out.println("Introduce una Url ");
		// String cadena = entrada.nextLine();

		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe", cadena); // "notas.txt"
		// pb.directory(new File("c:/Julio/"));

		Process p = null;
		p = pb.start();

		// esto no funciona
		retorno = p.waitFor();
		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("La ejecucion devuelve: " + retorno);
	}

}
