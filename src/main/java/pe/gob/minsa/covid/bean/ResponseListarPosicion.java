package pe.gob.minsa.covid.bean;

import java.util.List;

import pe.gob.minsa.covid.model.PosicionPersonaEpisodio;

public class ResponseListarPosicion {
	
	private String codigo;
	private List<PosicionPersonaEpisodio> posiciones;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<PosicionPersonaEpisodio> getPosiciones() {
		return posiciones;
	}
	public void setPosiciones(List<PosicionPersonaEpisodio> posiciones) {
		this.posiciones = posiciones;
	}
	@Override
	public String toString() {
		return "ResponseListarPosicion [codigo=" + codigo + ", posiciones=" + posiciones + ", getCodigo()="
				+ getCodigo() + ", getPosiciones()=" + getPosiciones() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public ResponseListarPosicion(String codigo, List<PosicionPersonaEpisodio> posiciones) {
		
		this.codigo = codigo;
		this.posiciones = posiciones;
	}
	public ResponseListarPosicion() {
		
	}
	
	
	

}
