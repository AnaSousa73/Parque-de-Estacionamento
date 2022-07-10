import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

class EstacionamentoDeficienteTest {

	@Test
	void test() {
		EstacionamentoDeficiente Estacionamento = new EstacionamentoDeficiente(8);
		assertEquals(TipoVeiculo.Deficiente, Estacionamento.TipoVeiculo);
	}

}
