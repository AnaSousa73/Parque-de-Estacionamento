import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EstacionamentoEletricoTest {

	@Test
	public void test() {
		EstacionamentoEletrico Estacionamento = new EstacionamentoEletrico(10);
		assertEquals(TipoVeiculo.Eletrico, Estacionamento.TipoVeiculo);
	}

}
