/**
 * @file Main
 * @brief App ejecutable
 * Descripcion: Se encarga de llamar a la clase de conexion, para estlecer la conexion del servidor y
 * a la clase ventana para inicializarla
 * 
 */


package gestionRestaurante.Restaurante;


public class App {
	
	
	/**
	 * @brief Main
	 * Descripcion: Metodo principal que ejecuta todo el programa
	 * @param args
	 */
  public static void main(String[] args) {
    
	  
	  
	  try {
			Conexion.conectar();
			ventana.iniciar();
			
		}catch (Exception e) {
			System.out.println("Error al incializar la ventana");
		}
		
	  
	  
  }
}
