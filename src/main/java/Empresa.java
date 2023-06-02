import java.util.*;

public class Empresa {

	private Collection<Bus> buses;
	private int rut;
	private String direccion;
	private int redesSociales;


	public int getRut() {
		return this.rut;
	}  //Getters

	public String getDireccion() {
		return this.direccion;
	}

	public int getRedesSociales() {
		return this.redesSociales;
	}


	public Bus agregarBus(String patente, String marca, String modelo) { // metodo para agregar buses

		throw new UnsupportedOperationException();

	}


	public Conductor agregarConductor(String nombre, String apellido, int numeroTelefono, String tipoLicencia) { //metodo para agregar conductor

		throw new UnsupportedOperationException();
	}


	public List<Bus> obtenerBusesPorDestino(String ciudadOrigen) { //metodo para obtener buses segun destino

		throw new UnsupportedOperationException();
	}

	public Bus descontinuarBus(String patente) { //metodo para descontinuar un bus

		throw new UnsupportedOperationException();
	}

	public boolean asociarViajeABus(String patente, String ciudadOrigen, String ciudadDestino) { //metodo para asociar un viaje a un bus

		throw new UnsupportedOperationException();
	}

	public List<Bus> listaBuses() { //metodo para obetener la lista de buses

		throw new UnsupportedOperationException();
	}

	public List<Viaje> listaViajes() { //metodo para obtener la lista de viajes

		throw new UnsupportedOperationException();
	}

}