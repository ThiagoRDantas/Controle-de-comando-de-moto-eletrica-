package ccme;

public class Alarme {
	boolean ligado = false;
	
	void AtivarAlarme(Ligar ligar, Busina busina, Pisca pisca) {
		ligado = true;
		if(ligado == true) {
			busina.Businar();
			pisca.PiscaAlarme();
			ligar.DesligarVeiculo();
		}
	}
	
	

}
