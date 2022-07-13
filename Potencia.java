package ccme;

public class Potencia {
	
	private double modo1 = 10;
	private double modo2 = 15;
	private double modo3 = 20;
	
	void AcelerarModo1(Acelerar acelerar,SensorTripe sensor) {
		if(sensor.status() == false) {
		modo1 += acelerar.Acelerador();
		}else if(sensor.status() == true) {
			System.out.println("Tripé baixo");
		}
	}
	void AcelerarModo2(Acelerar acelerar, SensorTripe sensor) {
		if(sensor.status() == false) {
		modo2 += acelerar.Acelerador();
		}else if(sensor.status() == true) {
			System.out.println("Tripé baixo");
		}
	}
	void AcelerarModo3(Acelerar acelerar, SensorTripe sensor) {
		if(sensor.status() == false) {
		modo3 += acelerar.Acelerador();
		}else if(sensor.status() == true) {
			System.out.println("Tripé baixo");
		}
	}
	

}
