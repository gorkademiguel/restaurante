/**
 * Clase cliente
 * No utilizada en la aplicación, pero agregada en caso de que se le desee dar uso
 * Descripcion:	Define las caracteristicas de un Cliente.
 * 
 */


package gestionRestaurante.Restaurante;

public class Cliente {
	
	private String dni;
	private String nombre;

	public Cliente (String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
