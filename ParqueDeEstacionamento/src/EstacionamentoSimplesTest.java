import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionamentoSimplesTest {

	@Test
	void test() {
		EstacionamentoSimples Estacionamento = new EstacionamentoSimples(10);
		assertEquals(TipoVeiculo.Normal, Estacionamento.TipoVeiculo);
	}

}
