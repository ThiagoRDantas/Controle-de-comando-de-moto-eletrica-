package ccme;

public class Bateria {
	
	private double porcentagem = 100;
	
	double Consumo() {
		return porcentagem -= 0.10;
	}
	
	void QuantidadeDeBateria(Ligar ligar) {
		if(porcentagem < 1) {
			ligar.DesligarVeiculo();
		}
	}
	
	

}
