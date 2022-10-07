/*
Run -> Run Configurations -> Arguments

La llamada se hace desde 017 Multiproceso II.procesos2_llamada
*/

package procesos2_lectura;

public class Ej002_PintarNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// si no hay argumento no fallo pero salgo con -1
		if(args.length < 1) {
			System.exit(-1); // exitVal=-1
		}
		
		System.out.println("Mi nombre es: " +args[0]);
		System.exit(777); // exitVal=777
	}

}