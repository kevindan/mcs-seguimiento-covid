package pe.gob.minsa.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_ubigeo_casos")
public class UbigeoCasos {
	@Id
	@Column(name="id_registro")
	 public Long id;
	
	@Column(name="ubigeo")
	public String ubigeo;
	
	@Column(name="descripcion")
	public String descripcion;
	
	@Column(name="cantidad_casos")
	public Long cantidad;
	
	@Column(name="id_estado")
	public String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
