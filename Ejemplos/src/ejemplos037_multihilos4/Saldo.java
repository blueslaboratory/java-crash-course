package ejemplos037_multihilos4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class Saldo {

	File miFicheroTransferencias;
	
	public Boolean FicheroAcabado = false;
	public Boolean SinSaldo = false;
	
	public Double transferencias[] = new Double[100];
	public int numTransferencias = 0;
	
	private Double saldoCuenta = (double) 0;
	private int posicionTransferencia = 0;
	
	

	public Saldo(File FichTrans) {
		this.miFicheroTransferencias = FichTrans;

		// Leemos el fichero y lo volcamos en el array
		this.leerfichero();

		Double suma = (double) 0;

		for (int i=0; i<transferencias.length; i++) {
			suma = suma + transferencias[i];
		}
		
		System.out.println("Array Suma Transferencias = " + String.valueOf(suma));

		
		// Hacemos un calculo aleatorio del saldo de la cuenta 
		// aproximado con las transferencias
		numTransferencias = transferencias.length;
		Double importeSaldo = (double) 0;
		Random rnd = new Random();

		importeSaldo = (rnd.nextDouble() * (2000-500+1)+500); // (M-N+1)+N
		importeSaldo = (Math.round(importeSaldo*100.0) / 100.0) * numTransferencias;

		this.saldoCuenta = importeSaldo;

		System.out.println("El saldo de la cuenta es: " + this.saldoCuenta + " €");
	}

	
	
	// metodo para actualizar el saldo en cuenta
	private void actualizaSaldo(Double transferencia) {
		this.saldoCuenta -= transferencia;
		//saldoCuenta = saldoCuenta - transferencia;
	}

	
	
	public synchronized Double getTransferencia() {
		
		Double transferencia = (double) 0;
		
		if (posicionTransferencia < transferencias.length) {
			
			transferencia = transferencias[posicionTransferencia];
			posicionTransferencia++;
			
			if (posicionTransferencia >= this.numTransferencias) {
				this.FicheroAcabado = true;
				this.SinSaldo = true;
			}
			
		} else {
			transferencia = (double) (-1);
		}
		
		return transferencia;
	}

	
	
	public void leerfichero() {
		// Leemos el fichero
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(this.miFicheroTransferencias);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		br = new BufferedReader(fr);
		String linea;
		int i = 0;
		
		try {
			
			while ((linea = br.readLine()) != null) {
				this.transferencias[i] = Double.parseDouble(linea);
				i++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public Double getSaldo() {
		return this.saldoCuenta;
	}

	
	
	public synchronized void hacerTransferencia(Double transferencia) {
		try {

			if (this.getSaldo() > transferencia) {
				
				// Hacemos la transferencia y restamos el saldo
				System.out.println("Hacemos transferencia de: " + transferencia + " €");
				
				// Actualizamos el saldo disponible
				this.actualizaSaldo(transferencia);
				
				// Suponemos que hacer la transferencia, validaciones y simular, es un proceso
				// de 500 milisegundos
				Thread.sleep(500);
				
			} else {
				
				this.SinSaldo = true;
				System.out.println("No hay saldo para la siguiente transferencia de :" + transferencia + " €");
				
			}
		} catch (InterruptedException e) {
			return;
		}
	}
}
