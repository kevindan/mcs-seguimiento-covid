package pe.gob.minsa.covid.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Distrito {
	
	@Id
	@Column(name="id_registro")
	private Long registroId;
	
	@Column(name="id_departamento")
	private String departamentoId;
	
	@Column(name="id_provincia")
	private String provinciaId;
	
	@Column(name="id_distrito")
	private String distritoId;
	
	@Column(name="nomb_dis")
	private String nombDist;

	public Long getRegistroId() {
		return registroId;
	}

	public void setRegistroId(Long registroId) {
		this.registroId = registroId;
	}

	public String getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getProvinciaId() {
		return provinciaId;
	}

	public void setProvinciaId(String provinciaId) {
		this.provinciaId = provinciaId;
	}

	public String getDistritoId() {
		return distritoId;
	}

	public void setDistritoId(String distritoId) {
		this.distritoId = distritoId;
	}

	public String getNombDist() {
		return nombDist;
	}

	public void setNombDist(String nombDist) {
		this.nombDist = nombDist;
	}
	
	
}
