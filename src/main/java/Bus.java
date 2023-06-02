import java.util.*;

public class Bus {

	private Empresa administrador;
	private Collection<Viaje> viajes;
	private String patente;
	private String marca;
	private String modelo;

	//Getters
	public String getPatente() {
		return this.patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	//Setters
	public void setPatente(String patente) {this.patente = patente;}

	public void setMarca(String marca) {this.marca = marca;}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}