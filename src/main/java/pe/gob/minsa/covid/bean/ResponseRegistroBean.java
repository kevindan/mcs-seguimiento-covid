package pe.gob.minsa.covid.bean;

import java.io.Serializable;

public class ResponseRegistroBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	
	public ResponseRegistroBean() {
		
	}

	public ResponseRegistroBean(String codigo) {	
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ResponseRegistroBean [codigo=" + codigo + "]";
	}
	
}
