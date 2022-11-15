package dunkerque2;

public class Playa {

	private int soldadosAliadosLuchando;
	// en la playa solo cabe 1 embarcacion cada vez, pero el semaforo
	// se declara en el main y se pasa a cada embarcacion
	// Semaphore semaforo = new Semaphore(10);

	
	// CONSTRUCTOR
	public Playa() {
		this.soldadosAliadosLuchando = 400000;
	}

	
	// GETTERS Y SETTERS: ALT + SHIFT + S
	public synchronized int getSoldadosAliadosLuchando() {
		return soldadosAliadosLuchando;
	}

	public synchronized void setSoldadosAliadosLuchando(int soldadosAliados) {
		// la resta tiene que ir aqui, no vale tener la resta fuera del synchronized
		this.soldadosAliadosLuchando -= soldadosAliados;
	}
}
