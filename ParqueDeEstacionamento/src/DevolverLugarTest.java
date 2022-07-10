import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DevolverLugarTest {

	@Test
	void test() {
		Parque p1 = new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.DevolverVeiculo(0);
		assertEquals(null, p1.Lugares.get(0));
	}
	public void testDevolverVariosLugaresLivres() {
		
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Eletrico);
		p1.Estacionar(TipoVeiculo.Hidrogenio);
		p1.DevolverVeiculo(2);
		assertEquals(null, p1.Lugares.get(2));
	}
}
