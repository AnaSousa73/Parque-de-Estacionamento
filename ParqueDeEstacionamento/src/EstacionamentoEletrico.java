import java.util.Random;

public class EstacionamentoEletrico extends Estacionamento {

	public double PotenciaAbastecimento;
	
	public double getPotenciaAbastecimento() {
		return PotenciaAbastecimento;
	}
	public void setPotenciaAbastecimento(double potenciaAbastecimento) {
		PotenciaAbastecimento = potenciaAbastecimento;
	}
	@SuppressWarnings("static-access")
	public EstacionamentoEletrico (int EstacionamentoID) {
		super (EstacionamentoID);
		this.TipoVeiculo = TipoVeiculo.Eletrico;
	        
        Random randGenerator = new Random();
        PotenciaAbastecimento = randGenerator.nextDouble()*100;
	}
		public double PotenciaAbastecimento () {
		return EstacionamentoID;
	}
	public void IniciarAbastecimento() {
	}
	public void FecharAbastecimento() {
	}
		@SuppressWarnings("static-access")
		public EstacionamentoEletrico (int EstacionamentoID, double PotenciaAbastecimento) {
		super (EstacionamentoID);
		this.TipoVeiculo = TipoVeiculo.Eletrico;
		this.PotenciaAbastecimento = PotenciaAbastecimento;
		
	}
	
}

