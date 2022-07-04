package gestionRestaurante.Restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("connectionTest")
public class connectionTest {
	/**
	 * @brief Test Connection
	 * Descripcion: Se realiza un test de la funcionalidad de conexion
	 * @throws SQLException
	 */
	@Test
	public void cTest() throws SQLException {
		assertEquals(true, gestionRestaurante.Restaurante.Conexion.checkConnection());
	}
	
}
