import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AtribuirLugarTest {

	@Test
	void test() {
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
		
		for (Estacionamento Estacionamento : p1.Lugares) {
			switch (Estacionamento.TipoVeiculo) {
			
		case Eletrico: ParqueAntigo.add(new EstacionamentoEletrico(Estacionamento.EstacionamentoID,((EstacionamentoEletrico) Estacionamento).PotenciaAbastecimento));		
				
		break;
				
			case Hidrogenio: ParqueAntigo.add(new EstacionamentoHidrogenio(Estacionamento.EstacionamentoID));
				
			break;
				
			case Deficiente: ParqueAntigo.add((new EstacionamentoDeficiente(Estacionamento.EstacionamentoID)),((EstacionamentoDeficiente) Estacionamento).TamanhoEspecial));
			
			break;
			default:  ParqueAntigo.add( new EstacionamentoSimples(Estacionamento.EstacionamentoID));
			
				break;
			}
			
		}
		p1.Adaptor.AtribuirLugar(p1.Lugares, p1.Armazem.Lugares);
		
		for (Estacionamento Estacionamento : p1.Armazem.Lugares) {
			assertEquals(ParqueAntigo.get(Estacionamento.EstacionamentoID).EstacionamentoID, Estacionamento.EstacionamentoID);
		}

		for (Estacionamento Estacionamento : p1.Lugares) {
			assertEquals( null, Estacionamento);
			
		}	
	}
}


