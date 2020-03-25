package pe.gob.minsa.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_hospitales_departamento")
public class HospitalesDepartamento {
	
	@Id
	@Column(name="cod_ipress")
	private Long id;
	
	@Column(name="nombre_ipress")
	private String nombreHospitales;
	
	@Column(name="id_departamento")
	 private String departamentoId;
	
	@Column(name="nomb_departamento")
	private String nombreDepartamento;
	
	@Column(name="nom_provincia")
	private String nombreProvincia;
	
	@Column(name="nom_distrito")
	private String nombreDistrito;
	
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreHospitales() {
		return nombreHospitales;
	}

	public void setNombreHospitales(String nombreHospitales) {
		this.nombreHospitales = nombreHospitales;
	}

	public String getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}	
	
}
