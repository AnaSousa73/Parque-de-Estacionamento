import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionamentoHidrogenioTest {

	@Test
	void test() {
		EstacionamentoHidrogenio Estacionamento = new EstacionamentoHidrogenio(8);
		assertEquals(TipoVeiculo.Hidrogenio, Estacionamento.TipoVeiculo);
	}

}
