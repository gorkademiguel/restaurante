/**
 * @file Llamado a la base de datos
 * @brief Llamados: 
 *  Se encuentran todos los metodos para extraer o agregar informacion de la base de datos
 * 
 * 
 */
package gestionRestaurante.Restaurante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sentenciasSQL {

	
	/**
	 * @brief Registro Reserva
	 * Metodo utilizado para registrar las reservas, estableciendo una conexion con la base de datos, seguido de
	 * la insersion de los datos en la misma.
	 * @param dni DNI facilitado por el usuario
	 * @param fecha Fecha de la reserva.
	 * @return
	 */
public static boolean registrarReserva(String dni,String fecha) {
		
		
		String datosRegistro;
		int id=0;
		boolean on = false;
		try {		
			
			Conexion con = new Conexion();
			ResultSet rs = null;
			
			Connection cn = Conexion.conectar();
			Statement stm=cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM reservas");
			while (rs.next()) {
				id=id+1*3;
			}			
			
			datosRegistro="INSERT INTO reservas (idReserva,fecha,dniCliente) VALUES('"+id+"','"+fecha+"','"+dni+"')";
		
			stm.executeUpdate(datosRegistro);
			on=true;
			
			cn.close();
			rs.close();
			stm.close();
			
		} catch (SQLException e) {
			on = false;
			System.out.println("Error en la consulta de registro");
		}
		return on;
		
	}

/**
 * @brief Registro Cliente
 * Metodo utilizado para registrar clientes, estableciendo una conexion con la base de datos, seguido de 
 * la insersion de los datos en la misma.
 * @param dni	DNI facilitado por el usuario
 * @param nombre	Nombre del cliente a registrar
 * @return
 */

public static boolean registrarCliente(String dni,String nombre) {
	
	
	String datosRegistro;
	
	try {		
		
		Conexion con = new Conexion();
		ResultSet rs = null;
		boolean clienteExistente =false;
		
		
		Connection cn = Conexion.conectar();
		Statement stm=cn.createStatement();
		rs = stm.executeQuery("SELECT dni FROM cliente");
		while (rs.next()&&clienteExistente==false) {
			if(rs.getString(1).toUpperCase().replace(" ", "").equals(dni.replace(" ", "").toUpperCase())) {
				clienteExistente=true;
			}else {
				clienteExistente=false;
			}
		}			
		
		
		
		
		if(!clienteExistente) {
		datosRegistro="INSERT INTO cliente (dni,nombre) VALUES('"+dni+"','"+nombre+"')";
		stm.executeUpdate(datosRegistro);
		return false;
		}
		
		cn.close();
		rs.close();
		stm.close();
		
	} catch (SQLException e) {
		System.out.println("Error en la consulta de registro");
	}
	
	return true;
	
}

/**
 * @brief Test Registro Cliente
 * Metodo que realiza un test de la funcion que registra un cliente
 * @param dni	DNI facilitado por el usuario
 * @param nombre	Nombre del cliente a registrar
 * @return
 */

public static boolean testRegistrarCliente(String dni,String nombre) {
	
	
	String datosRegistro;
	boolean conexion=false;
	try {		
		
		Conexion con = new Conexion();
		ResultSet rs = null;
		boolean clienteExistente =false;
		
		
		Connection cn = Conexion.conectar();
		Statement stm=cn.createStatement();
		rs = stm.executeQuery("SELECT dni FROM cliente");
		while (rs.next()&&clienteExistente==false) {
			if(rs.getString(1).toUpperCase().replace(" ", "").equals(dni.replace(" ", "").toUpperCase())) {
				clienteExistente=true;
				conexion=true;
			}else {
				clienteExistente=false;
				conexion=true;
			}
		}			
		
		
		
		
		if(clienteExistente) {
		datosRegistro="INSERT INTO cliente (dni,nombre) VALUES('"+dni+"','"+nombre+"')";
		stm.executeUpdate(datosRegistro);
		return false;
		}
		
		cn.close();
		rs.close();
		stm.close();
		
	} catch (SQLException e) {
		System.out.println("Error en la consulta de registro");
	} finally {
		return conexion;
	}
	
	
	
}
	
	
	
}
