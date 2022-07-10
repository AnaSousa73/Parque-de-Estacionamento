import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionamentoEletricoTest {

	@Test
	void test() {
		EstacionamentoEletrico Estacionamento = new EstacionamentoEletrico(10);
		assertEquals(TipoVeiculo.Eletrico, Estacionamento.TipoVeiculo);
	}

}
