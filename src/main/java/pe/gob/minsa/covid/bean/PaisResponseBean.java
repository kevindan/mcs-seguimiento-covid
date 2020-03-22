package pe.gob.minsa.covid.bean;

import java.io.Serializable;
import java.util.List;

import pe.gob.minsa.covid.model.Pais;

public class PaisResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private List<Pais> paises;
	
	public PaisResponseBean() {
		
	}

	public PaisResponseBean(String codigo, List<Pais> paises) {	
		this.codigo = codigo;
		this.paises = paises;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	@Override
	public String toString() {
		return "PaisResponseBean [codigo=" + codigo + ", paises=" + paises + "]";
	}

}
