import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionamentoEletricoTest2 {

	@Test
	void test() {
		EstacionamentoEletrico Estacionamento = new EstacionamentoEletrico(10);
		assertEquals(TipoVeiculo.Eletrico, Estacionamento.TipoVeiculo);
	}

}
