import java.util.*;

public class Empresa {

	private Collection<Bus> buses;
	private int rut;
	private String direccion;
	private int redesSociales;

	public int getRut() {
		return this.rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getRedesSociales() {
		return this.redesSociales;
	}

	/**
	 * 
	 * @param patente
	 * @param marca
	 * @param modelo
	 */
	public Bus agregarBus(String patente, String marca, String modelo) {
		// TODO - implement Empresa.agregarBus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param numeroTelefono
	 * @param tipoLicencia
	 */
	public Conductor agregarConductor(String nombre, String apellido, int numeroTelefono, String tipoLicencia) {
		// TODO - implement Empresa.agregarConductor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ciudadOrigen
	 */
	public List<Bus> obtenerBusesPorDestino(String ciudadOrigen) {
		// TODO - implement Empresa.obtenerBusesPorDestino
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param patente
	 */
	public Bus descontinuarBus(String patente) {
		// TODO - implement Empresa.descontinuarBus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param patente
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 */
	public boolean asociarViajeABus(String patente, String ciudadOrigen, String ciudadDestino) {
		// TODO - implement Empresa.asociarViajeABus
		throw new UnsupportedOperationException();
	}

	public List<Bus> listaBuses() {
		// TODO - implement Empresa.listaBuses
		throw new UnsupportedOperationException();
	}

	public List<Viaje> listaViajes() {
		// TODO - implement Empresa.listaViajes
		throw new UnsupportedOperationException();
	}

}