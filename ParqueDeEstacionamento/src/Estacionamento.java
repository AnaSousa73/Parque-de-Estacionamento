
public abstract class Estacionamento {

	public int EstacionamentoID;
	public TipoVeiculo TipoVeiculo;
	
	Estacionamento(int EstacionamentoID) {
		this.EstacionamentoID = EstacionamentoID;
		
	}

	@Override
	public String toString() {
		return "Estacionamento [ Lugar de Estacionamento= " + EstacionamentoID + ", Tipo de Veiculo= " + TipoVeiculo + "]";
	}
	
	
	
}
