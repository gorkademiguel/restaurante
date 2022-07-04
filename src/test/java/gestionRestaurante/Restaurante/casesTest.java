/**
 * @file Test
 * @brief Test
 * Descripcion: Se realiza un test de la funcionalidad de los metodos implementados, tanto de conexion como de acceso y adicion a la
 * base de datos
 * 
 * 
 */
package gestionRestaurante.Restaurante;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@DisplayName("casesTest")
class casesTest {

	@BeforeAll
	public static void setUp() {
		System.out.println("\n Running setUP...");
		new casesTest();
	}
	
	/**
	 * @brief Test Connection
	 * Descripcion: Se realiza un test de la funcionalidad de conexion
	 * @throws SQLException
	 */
	@Test
	public void connectionTest() throws SQLException {
		System.out.println("1");
		assertEquals(true, gestionRestaurante.Restaurante.Conexion.checkConnection());
	}
	/**
	 * @brief Test Nuevo Cliente
	 * Descripcion: Se realiza un test de la funcionalidad de añadir nuevo cliente
	 * @throws SQLException
	 */
	@Test
	public void  nuevoClienteTest() {
		System.out.println("2");
		assertEquals(true, gestionRestaurante.Restaurante.sentenciasSQL.testRegistrarCliente("test1", "test1"));
	}
	/**
	 * @brief Test Nuevo Registro
	 * Descripcion: Se realiza un test de la funcionalidad de añadir nuevo registro
	 * @throws SQLException
	 */
	@Test
	public void nuevoRegistroTest() {
		System.out.println("3");
		assertEquals(true, gestionRestaurante.Restaurante.sentenciasSQL.registrarReserva("test", "test"));
	}
	
	@After
	public void tearDown() {
		System.out.println("4");
		System.out.println("Running tear down...");
	}

}
