public class Viaje {

	private Bus bus;
	private Conductor conductor;
	private String ciudadOrigen;
	private String ciudadDestino;
	private int horaSalida;
	private int horaLlegada;

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public int getHoraSalida() {
		return this.horaSalida;
	}

	public int getHoraLlegada() {
		return this.horaLlegada;
	}

}