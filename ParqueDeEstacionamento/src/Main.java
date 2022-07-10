
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parque p1= new Parque();
		p1.Estacionar(TipoVeiculo.Normal);
		p1.FechoDiario();
		p1.Estacionar(TipoVeiculo.Eletrico);
		p1.FechoDiario();
		p1.Estacionar(TipoVeiculo.Hidrogenio);
		p1.FechoDiario();
		p1.Estacionar(TipoVeiculo.Deficiente);
		p1.FechoDiario();
		
		
		
		
	}
	

}
