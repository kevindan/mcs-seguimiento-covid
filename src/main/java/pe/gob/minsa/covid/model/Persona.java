package pe.gob.minsa.covid.model;

import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fecAutorizacion;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres ;
	private String ubigeoDireccion;
	private String domicilio;
	private String correo; 
	private String telefono;
	private String indContactoVirus;
	private String indPaisVisita;
	private String codPaisVisita;
		
	public Persona() {
		
	}
	
	public Persona(String fecAutorizacion, String apellidoPaterno, String apellidoMaterno, String nombres,
			String ubigeoDireccion, String domicilio, String correo, String telefono, String indContactoVirus,
			String indPaisVisita, String codPaisVisita) {
	
		this.fecAutorizacion = fecAutorizacion;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.ubigeoDireccion = ubigeoDireccion;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
		this.indContactoVirus = indContactoVirus;
		this.indPaisVisita = indPaisVisita;
		this.codPaisVisita = codPaisVisita;
	}
	
	public String getFecAutorizacion() {
		return fecAutorizacion;
	}

	public void setFecAutorizacion(String fecAutorizacion) {
		this.fecAutorizacion = fecAutorizacion;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getUbigeoDireccion() {
		return ubigeoDireccion;
	}

	public void setUbigeoDireccion(String ubigeoDireccion) {
		this.ubigeoDireccion = ubigeoDireccion;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndContactoVirus() {
		return indContactoVirus;
	}

	public void setIndContactoVirus(String indContactoVirus) {
		this.indContactoVirus = indContactoVirus;
	}

	public String getIndPaisVisita() {
		return indPaisVisita;
	}

	public void setIndPaisVisita(String indPaisVisita) {
		this.indPaisVisita = indPaisVisita;
	}

	public String getCodPaisVisita() {
		return codPaisVisita;
	}

	public void setCodPaisVisita(String codPaisVisita) {
		this.codPaisVisita = codPaisVisita;
	}

	@Override
	public String toString() {
		return "Persona [fecAutorizacion=" + fecAutorizacion + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", nombres=" + nombres + ", ubigeoDireccion="
				+ ubigeoDireccion + ", domicilio=" + domicilio + ", correo=" + correo + ", telefono=" + telefono
				+ ", indContactoVirus=" + indContactoVirus + ", indPaisVisita=" + indPaisVisita + ", codPaisVisita="
				+ codPaisVisita + "]";
	}
	
}
