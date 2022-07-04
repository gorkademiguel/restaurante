/**
 * 
 * @file Conectividad:
 * @brief Conexion con base de datos
 * Descripcion: Se encarga de conectarse a la base de datos y devolver hacer catch en el caso de error de conexion o driver.
 * 
 * 
 */

package gestionRestaurante.Restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//Variables
	
	public static final String url="jdbc:mysql://localhost:3305/restaurante";
	public static final String usuario="root";
	public static final String password="";
	public static Connection conexion = null;
	public static boolean on=true;
	
	
	/**
	 * @brief Metodo de conexion
	 * Metodo que establece  la conexion con el servidor
	 * @return
	 * @throws SQLException
	 */
	
	@SuppressWarnings("finally")
	public static Connection conectar() throws SQLException {
			try {
				//Datos para realizar la conexion
				conexion = DriverManager.getConnection(url,usuario,password);
				
			} catch (SQLException e) {
				on=false;
				System.out.println("Error al conectarse a base de datos");
			}finally {

				return conexion;			
			}
	}
	
	public static boolean checkConnection() throws SQLException {
		
		conectar();
		return on;
	}
	

}
