package pe.gob.minsa.covid.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Provincia {
	@Id
	@Column(name="id_registro")
	private Long registroId;
	
	
	@Column(name="id_departamento")
	private String departamentoId;
	
	@Column(name="id_provincia")
	private String provinciaId;
	
	@Column(name="nomb_prov")
	private String nombreProv;

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

	public String getNombreProv() {
		return nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}


}
