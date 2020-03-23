package pe.gob.minsa.covid.bean;

import java.io.Serializable;

import pe.gob.minsa.covid.model.Georeferencia;
import pe.gob.minsa.covid.model.Persona;
import pe.gob.minsa.covid.model.Sintomas;

public class RequestRegistroBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipRegistro;
	private String tipDocumento;
	private String numDocumento;
	private String fecRegistro;
	private Persona persona;
	private Sintomas sintomas;
	private Georeferencia georeferencia;

	public RequestRegistroBean() {
		
	}

	public RequestRegistroBean(String tipRegistro, String tipDocumento, String numDocumento, String fecRegistro,
			Persona persona, Sintomas sintomas, Georeferencia georeferencia) {
		
		this.tipRegistro = tipRegistro;
		this.tipDocumento = tipDocumento;
		this.numDocumento = numDocumento;
		this.fecRegistro = fecRegistro;
		this.persona = persona;
		this.sintomas = sintomas;
		this.georeferencia = georeferencia;
	}

	public String getTipRegistro() {
		return tipRegistro;
	}

	public void setTipRegistro(String tipRegistro) {
		this.tipRegistro = tipRegistro;
	}

	public String getTipDocumento() {
		return tipDocumento;
	}

	public void setTipDocumento(String tipDocumento) {
		this.tipDocumento = tipDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(String fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Sintomas getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}

	public Georeferencia getGeoreferencia() {
		return georeferencia;
	}

	public void setGeoreferencia(Georeferencia georeferencia) {
		this.georeferencia = georeferencia;
	}

	@Override
	public String toString() {
		return "RequestRegistroBean [tipRegistro=" + tipRegistro + ", tipDocumento=" + tipDocumento + ", numDocumento="
				+ numDocumento + ", fecRegistro=" + fecRegistro + ", persona=" + persona + ", sintomas=" + sintomas
				+ ", georeferencia=" + georeferencia + "]";
	}
	
}
