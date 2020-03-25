package pe.gob.minsa.covid.bean;
import java.util.List;

import pe.gob.minsa.covid.model.UbigeoCasos;

public class ResponseUbigeoCasos {

	private String codigo;
	private List<UbigeoCasos> ubigeoCasos;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<UbigeoCasos> getUbigeoCasos() {
		return ubigeoCasos;
	}
	public void setUbigeoCasos(List<UbigeoCasos> ubigeoCasos) {
		this.ubigeoCasos = ubigeoCasos;
	}
	@Override
	public String toString() {
		return "ResponseUbigeoCasos [codigo=" + codigo + ", ubigeoCasos=" + ubigeoCasos + ", getCodigo()=" + getCodigo()
				+ ", getUbigeoCasos()=" + getUbigeoCasos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public ResponseUbigeoCasos(String codigo, List<UbigeoCasos> ubigeoCasos) {
		
		this.codigo = codigo;
		this.ubigeoCasos = ubigeoCasos;
	}
	public ResponseUbigeoCasos() {
		
	}

	
}
