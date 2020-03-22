package pe.gob.minsa.covid.bean;

import java.io.Serializable;

public class PaisRequestBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pais_id;
	private String descripcion;
	private String estado;
	private String usuario;
			
	public PaisRequestBean() {
		
	}

	public PaisRequestBean(String pasi_id, String descripcion, String estado, String usuario) {
		
		this.pais_id = pasi_id;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuario = usuario;
	}

	public String getPasi_id() {
		return pais_id;
	}

	public void setPasi_id(String pasi_id) {
		this.pais_id = pasi_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Pais [pasi_id=" + pais_id + ", descripcion=" + descripcion + ", estado=" + estado + ", usuario="
				+ usuario + "]";
	}

	
}
