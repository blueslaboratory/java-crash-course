/*
Crea un programa Java llamado LeerNombre.java que reciba desde los argumentos del main() un
nombre y lo visualice en pantalla. Utiliza el valor 1 para la salida cuando todo ha ido correctamente
y el valor -1 para la salida cuando algo falla.

Rellenar el array String[] args:
1. Project -> Properties
2. Run/Debug Settings 
3. New Java Application
4. Arguments

La llamada se hace desde 017 Multiproceso II.procesos2_llamada
*/

package procesos2_lectura;

public class Ej001_Leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length < 1) {
			System.exit(-1);
		}

		System.out.println("Mi nombre es " + args[0]);
		System.exit(0);

	}

}
