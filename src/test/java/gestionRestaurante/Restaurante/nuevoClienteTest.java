package gestionRestaurante.Restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("nuevoClienteTest")
public class nuevoClienteTest {

	
	/**
	 * @brief Test Nuevo Cliente
	 * Descripcion: Se realiza un test de la funcionalidad de añadir nuevo cliente
	 * @throws SQLException
	 */
	@Test
	public void ncTest() throws SQLException {
		assertEquals(true, gestionRestaurante.Restaurante.Conexion.checkConnection());
	}
}
