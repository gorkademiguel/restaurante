package gestionRestaurante.Restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("nuevoRegistroTest")
public class nuevoRegistroTest {
	/**
	 * @brief Test Nuevo Registro
	 * Descripcion: Se realiza un test de la funcionalidad de añadir nuevo registro
	 * @throws SQLException
	 */
	@Test
	public void nrTest() throws SQLException {
		assertEquals(true, gestionRestaurante.Restaurante.sentenciasSQL.registrarReserva("test", "test"));
	}
	
}
