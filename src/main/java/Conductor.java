import java.util.*;

public class Conductor {

	private Collection<Viaje> viajes;
	private String nombre;
	private String apellido;
	private int numeroTelefono;
	private String tipoLicencia;

	//Getters
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public String getTipoLicencia() {
		return this.tipoLicencia;
	}

}