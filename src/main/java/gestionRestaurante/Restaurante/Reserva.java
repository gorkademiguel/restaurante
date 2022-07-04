/**
 * Clase Reserva
 * No utilizada en la aplicación, pero agregada en caso de que se le desee dar uso
 * Descripcion:	Define las caracteristicas de una Reserva.
 * 
 */

package gestionRestaurante.Restaurante;

public class Reserva {

	private int idReserva;
	private String Fecha;
	private String dniCliente;
	
	public Reserva (int idReserva, String Fecha, String dniCliente) {
		
		this.idReserva=idReserva;
		this.Fecha=Fecha;
		this.dniCliente=dniCliente;
		
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	
	
}
