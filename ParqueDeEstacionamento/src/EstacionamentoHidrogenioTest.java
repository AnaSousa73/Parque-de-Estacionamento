import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

class EstacionamentoHidrogenioTest {

	@Test
	void test() {
		EstacionamentoHidrogenio Estacionamento = new EstacionamentoHidrogenio(8);
		assertEquals(TipoVeiculo.Hidrogenio, Estacionamento.TipoVeiculo);
	}

}
