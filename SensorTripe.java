package ccme;

public class SensorTripe {
	
	private boolean tripeBaixo = true;
	
	boolean LevantarTripe() {
		return tripeBaixo = false;
	}
	
	boolean TripeLevantado() {
		return tripeBaixo;
	}
	
	boolean status() {
		return tripeBaixo;
	}

}
