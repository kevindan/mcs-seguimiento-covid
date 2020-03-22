package pe.gob.minsa.covid.bean;

import java.io.Serializable;

public class ResponseValidaMpiBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo_documento;
	private String numero_documento;
	private String nombres;
	private String apellido_paterno;
	private String apellido_materno;
	private String fecha_nacimiento;
	private String sexo;

	public ResponseValidaMpiBean() {

	}

	public ResponseValidaMpiBean(String tipo_documento, String numero_documento, String nombres,
			String apellido_paterno, String apellido_materno, String fecha_nacimiento, String sexo) {

		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.nombres = nombres;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "ResponseValidaMpiBean [tipo_documento=" + tipo_documento + ", numero_documento=" + numero_documento
				+ ", nombres=" + nombres + ", apellido_paterno=" + apellido_paterno + ", apellido_materno="
				+ apellido_materno + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + "]";
	}
	
}
