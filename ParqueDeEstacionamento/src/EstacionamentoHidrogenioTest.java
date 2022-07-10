import static org.junit.Assert.*;


import org.junit.Test;

public class EstacionamentoHidrogenioTest {

	@Test
	public void test() {
		EstacionamentoHidrogenio Estacionamento = new EstacionamentoHidrogenio(8);
		assertEquals(TipoVeiculo.Hidrogenio, Estacionamento.TipoVeiculo);
	}

}
