
public class EstacionamentoDeficiente extends Estacionamento {

	
	@SuppressWarnings("static-access")
	EstacionamentoDeficiente(int EstacionamentoID){
        super(EstacionamentoID);
        this.TipoVeiculo = TipoVeiculo.Deficiente;
	}
	int	TamanhoEspecial;
		
    public int getTamanhoEspecial() {
		return TamanhoEspecial;
	}

	public void setTamanhoEspecial(int tamanhoEspecial) {
		TamanhoEspecial = tamanhoEspecial;
	}

	@SuppressWarnings("static-access")
	public EstacionamentoDeficiente (int EstacionamentoID, int TamanhoEspecial) {
    	super (EstacionamentoID);
    	this.TipoVeiculo = TipoVeiculo.Deficiente;
    	this.TamanhoEspecial = TamanhoEspecial;
        
	}
}
		
