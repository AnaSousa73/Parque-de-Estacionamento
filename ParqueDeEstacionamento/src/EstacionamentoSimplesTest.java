import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

class EstacionamentoSimplesTest {

	@Test
	void test() {
		EstacionamentoSimples Estacionamento = new EstacionamentoSimples(10);
		assertEquals(TipoVeiculo.Normal, Estacionamento.TipoVeiculo);
	}

}
