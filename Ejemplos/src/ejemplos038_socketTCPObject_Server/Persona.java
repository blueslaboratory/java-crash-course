package ejemplos038_socketTCPObject_Server;

import java.io.Serializable;

@SuppressWarnings("serial")

public class Persona implements Serializable {
	
	String nombre;
	int edad;

	
	// CONSTRUCTORES
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}