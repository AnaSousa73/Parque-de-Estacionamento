import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EstacionamentoDeficienteTest {

	@Test
	public void test() {
		EstacionamentoDeficiente Estacionamento = new EstacionamentoDeficiente(8);
		assertEquals(TipoVeiculo.Deficiente, Estacionamento.TipoVeiculo);
	}

}
