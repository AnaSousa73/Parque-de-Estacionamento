import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionamentoDeficienteTest {

	@Test
	void test() {
		EstacionamentoDeficiente Estacionamento = new EstacionamentoDeficiente(8);
		assertEquals(TipoVeiculo.Deficiente, Estacionamento.TipoVeiculo);
	}

}
