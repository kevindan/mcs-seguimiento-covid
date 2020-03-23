package pe.gob.minsa.covid.model;

import java.io.Serializable;

public class Georeferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String latitud;
	private String longitud;
	
	public Georeferencia() {
		
	}

	public Georeferencia(String latitud, String longitud) {
	
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Georeferencia [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
}
