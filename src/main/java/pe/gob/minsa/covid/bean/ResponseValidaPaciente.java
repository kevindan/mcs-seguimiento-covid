package pe.gob.minsa.covid.bean;

import java.io.Serializable;

public class ResponseValidaPaciente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private ResponseValidaMpiBean datos_paciente;
	
	public ResponseValidaPaciente() {
		
	}

	public ResponseValidaPaciente(String codigo, ResponseValidaMpiBean datos_paciente) {

		this.codigo = codigo;
		this.datos_paciente = datos_paciente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ResponseValidaMpiBean getDatos_paciente() {
		return datos_paciente;
	}

	public void setDatos_paciente(ResponseValidaMpiBean datos_paciente) {
		this.datos_paciente = datos_paciente;
	}

	@Override
	public String toString() {
		return "ResponseValidaPaciente [codigo=" + codigo + ", datos_paciente=" + datos_paciente + "]";
	}
	

}
