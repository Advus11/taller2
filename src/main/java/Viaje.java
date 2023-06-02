public class Viaje {

	private Bus bus;
	private Conductor conductor;
	private String ciudadOrigen;
	private String ciudadDestino;
	private int horaSalida;
	private int horaLlegada;

	//Getters
	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public int getHoraSalida() {
		return this.horaSalida;
	}

	public int getHoraLlegada() {
		return this.horaLlegada;
	}

	//Setters

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

}