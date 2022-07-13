package ccme;

public class SensorDeTemperatura {
	
	private double temperatura = 28;
	
	void VerificarTemperatura(Ligar ligar) {
		if(temperatura > 100) {
			ligar.DesligarVeiculo();
		}else if(temperatura < 100) {
			ligar.LigarVeiculo();
		}
	}
	
	

}
