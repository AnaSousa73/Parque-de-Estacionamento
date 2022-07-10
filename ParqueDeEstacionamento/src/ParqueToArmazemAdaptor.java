import java.util.ArrayList;

public class ParqueToArmazemAdaptor implements IParqueStorageAdaptor  {
			
			public void AtribuirLugar(ArrayList<Estacionamento> Parque, ArrayList<Estacionamento> Armazem){
							
				for (Estacionamento Estacionamento : Parque) {
					if (Estacionamento!=null) {
						Armazem.add(Estacionamento);
						Parque.set(Estacionamento.EstacionamentoID,null);
					}						
				}
									
			}
}
