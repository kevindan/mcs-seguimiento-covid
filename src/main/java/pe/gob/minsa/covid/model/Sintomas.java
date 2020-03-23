package pe.gob.minsa.covid.model;

import java.io.Serializable;

public class Sintomas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String idEstado;
	private String indTos;
	private String indGarganta;
	private String indRespira;
	private String indCongestion;
	private String indFiebre;

	public Sintomas() {

	}

	public Sintomas(String idEstado, String indTos, String indGarganta, String indRespira, String indCongestion,
			String indFiebre) {

		this.idEstado = idEstado;
		this.indTos = indTos;
		this.indGarganta = indGarganta;
		this.indRespira = indRespira;
		this.indCongestion = indCongestion;
		this.indFiebre = indFiebre;
	}

	public String getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}

	public String getIndTos() {
		return indTos;
	}

	public void setIndTos(String indTos) {
		this.indTos = indTos;
	}

	public String getIndGarganta() {
		return indGarganta;
	}

	public void setIndGarganta(String indGarganta) {
		this.indGarganta = indGarganta;
	}

	public String getIndRespira() {
		return indRespira;
	}

	public void setIndRespira(String indRespira) {
		this.indRespira = indRespira;
	}

	public String getIndCongestion() {
		return indCongestion;
	}

	public void setIndCongestion(String indCongestion) {
		this.indCongestion = indCongestion;
	}

	public String getIndFiebre() {
		return indFiebre;
	}

	public void setIndFiebre(String indFiebre) {
		this.indFiebre = indFiebre;
	}

	@Override
	public String toString() {
		return "Sintomas [idEstado=" + idEstado + ", indTos=" + indTos + ", indGarganta=" + indGarganta
				+ ", indRespira=" + indRespira + ", indCongestion=" + indCongestion + ", indFiebre=" + indFiebre + "]";
	}

}
