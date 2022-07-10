import java.util.ArrayList;

public class Parque {
	
	public ArrayList<Estacionamento> Lugares = new ArrayList<Estacionamento>();
	public IParqueStorageAdaptor Adaptor;
	public Armazem Armazem = new Armazem();
	
	public Parque() {
		this.Adaptor = new ParqueToArmazemAdaptor();
		this.Armazem = new Armazem();
	}
	public Estacionamento Estacionar (TipoVeiculo tipo) {
		Estacionamento resultado = null;
		int LugarVazio = Lugares.size();
		boolean ReutilizouLugar = false;
		
		for ( int i=0; i<Lugares.size(); i++ ) {
			if (Lugares.get(i) == null) {	
				LugarVazio = i;
				ReutilizouLugar = true;
					break;					
			}
		}
		
		switch (tipo) {
			case Eletrico:
				resultado = new EstacionamentoEletrico(Lugares.size());
				break;
			case Hidrogenio:
				resultado = new EstacionamentoHidrogenio(Lugares.size());
				break;
			case Deficiente:
				resultado = new EstacionamentoDeficiente(Lugares.size());
				break;	
				default:
				resultado = new EstacionamentoSimples(Lugares.size());
				break;
		}
		
		
		if (!ReutilizouLugar) {
			Lugares.add(resultado);			
		} else Lugares.set(LugarVazio, resultado);
		    return resultado ;
	}	
	public void DevolverVeiculo(int EstacionamentoID) {
	Lugares.set(EstacionamentoID, null);
	}
	public void FechoDiario(){
	this.Adaptor.AtribuirLugar(Lugares, this.Armazem.Lugares);
	}
}

