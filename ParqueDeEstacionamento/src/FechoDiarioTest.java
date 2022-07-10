import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FechoDiarioTest {

	@Test
	public void test() {
		Parque p1= new Parque();
		@SuppressWarnings("unused")
		ParqueToArmazemAdaptor Adaptor= new ParqueToArmazemAdaptor();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Normal);
		p1.Estacionar(TipoVeiculo.Hidrogenio);
		ArrayList<Estacionamento> ParqueAntigo= new ArrayList<Estacionamento>();
		
		for (Estacionamento estacionamento : p1.Lugares) {
			switch (estacionamento.TipoVeiculo) {
			
			case Eletrico: ParqueAntigo.add( new EstacionamentoEletrico(estacionamento.EstacionamentoID,((EstacionamentoEletrico) estacionamento).PotenciaAbastecimento));		
			break;
				
			case Hidrogenio: ParqueAntigo.add(new EstacionamentoHidrogenio(estacionamento.EstacionamentoID));
			break;
				
			default:  ParqueAntigo.add( new EstacionamentoSimples(estacionamento.EstacionamentoID));
			break;
			}
			
		}
		p1.FechoDiario();
		
		for (Estacionamento estacionamento : p1.Armazem.Lugares) {
			assertEquals(ParqueAntigo.get(estacionamento.EstacionamentoID).EstacionamentoID, estacionamento.EstacionamentoID);
		}
		for (Estacionamento estacionamento : p1.Lugares) {
			assertEquals( null, estacionamento);
		}	
	}
}
