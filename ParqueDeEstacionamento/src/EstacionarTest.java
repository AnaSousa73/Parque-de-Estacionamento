import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstacionarTest {

	@Test
	public void EstacionamentoSimples() {
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		assertEquals( TipoVeiculo.Normal,p1.Lugares.get(0).TipoVeiculo);
	}			
		@Test
	public void EstacioanmentoHidrogenio() {
		Parque p1 = new Parque();
		p1.Estacionar(TipoVeiculo.Hidrogenio);
		assertEquals( TipoVeiculo.Hidrogenio,p1.Lugares.get(0).TipoVeiculo);
	}
	@Test
	public void EstacionamentoEletrico() {
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Eletrico);
		assertEquals( TipoVeiculo.Eletrico, p1.Lugares.get(0).TipoVeiculo);
	}
	@Test
	public void EstacionamentoDeficiente() {
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Deficiente);
		assertEquals( TipoVeiculo.Deficiente, p1.Lugares.get(4).TipoVeiculo);
	}
	@Test
	public void testePosicao() {
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Hidrogenio);
		assertEquals(TipoVeiculo.Hidrogenio,p1.Lugares.get(5).TipoVeiculo);
	}
	@Test
	public void testePosicaoDepoisDeDevolucao() {
		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.DevolverVeiculo(2);
		p1.Estacionar(TipoVeiculo.Hidrogenio);	
		assertEquals(TipoVeiculo.Hidrogenio,p1.Lugares.get(2).TipoVeiculo);
	}
}
