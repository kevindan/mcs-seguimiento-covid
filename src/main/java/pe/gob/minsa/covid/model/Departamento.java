package pe.gob.minsa.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamento {

	@Id
	@Column(name="id_registro")
	private Long registroId;
	
	@Column(name="id_departamento")
	private String departamentoId;
	
	@Column(name="nomb_dep")
	private String nombreDep;

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

	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}
	
	

}
