package pe.gob.minsa.covid.model;

public class PosicionPersonaEpisodio {
	
	private Long id_persona_episodio_seguimiento ;
	private Long id_persona_episodio;
	private String longitud;
	private String latitud ;
	private String est_registro;
	private String usr_registro ;
	private String fec_registro ;
	private String usr_update;
	private String fec_update ;
	
	
	public Long getId_persona_episodio_seguimiento() {
		return id_persona_episodio_seguimiento;
	}
	public void setId_persona_episodio_seguimiento(Long id_persona_episodio_seguimiento) {
		this.id_persona_episodio_seguimiento = id_persona_episodio_seguimiento;
	}
	public Long getId_persona_episodio() {
		return id_persona_episodio;
	}
	public void setId_persona_episodio(Long id_persona_episodio) {
		this.id_persona_episodio = id_persona_episodio;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getEst_registro() {
		return est_registro;
	}
	public void setEst_registro(String est_registro) {
		this.est_registro = est_registro;
	}
	public String getUsr_registro() {
		return usr_registro;
	}
	public void setUsr_registro(String usr_registro) {
		this.usr_registro = usr_registro;
	}
	public String getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}
	public String getUsr_update() {
		return usr_update;
	}
	public void setUsr_update(String usr_update) {
		this.usr_update = usr_update;
	}
	public String getFec_update() {
		return fec_update;
	}
	public void setFec_update(String fec_update) {
		this.fec_update = fec_update;
	}
	@Override
	public String toString() {
		return "PosicionPersonaEpisodio [id_persona_episodio_seguimiento=" + id_persona_episodio_seguimiento
				+ ", id_persona_episodio=" + id_persona_episodio + ", longitud=" + longitud + ", latitud=" + latitud
				+ ", est_registro=" + est_registro + ", usr_registro=" + usr_registro + ", fec_registro=" + fec_registro
				+ ", usr_update=" + usr_update + ", fec_update=" + fec_update + "]";
	}
	
	public PosicionPersonaEpisodio() {}
	
	public PosicionPersonaEpisodio(Long id_persona_episodio_seguimiento, Long id_persona_episodio, String longitud,
			String latitud, String est_registro, String usr_registro, String fec_registro, String usr_update,
			String fec_update) {
		
		this.id_persona_episodio_seguimiento = id_persona_episodio_seguimiento;
		this.id_persona_episodio = id_persona_episodio;
		this.longitud = longitud;
		this.latitud = latitud;
		this.est_registro = est_registro;
		this.usr_registro = usr_registro;
		this.fec_registro = fec_registro;
		this.usr_update = usr_update;
		this.fec_update = fec_update;
	}
	
	
	
	

}
