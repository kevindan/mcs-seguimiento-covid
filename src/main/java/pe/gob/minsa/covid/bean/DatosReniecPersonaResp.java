package pe.gob.minsa.covid.bean;

import java.io.Serializable;
import java.util.Arrays;

public class DatosReniecPersonaResp implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codRespuesta;
	private String desRespuesta;
	private String codOrigen;
	private String desOrigen;
	private String nroDocumento;
	private String calidadMigratoria;
	private String digVerificacion;
	private String apePadre;
	private String prenomPadre;
	private String apeMadre;
	private String tipDocMadre;
	private String numDocMadre;
	private String prenomMadre;
	private String apeCasada;
	private String prenombres;
	private String codUbiContinenteDomicilio;
	private String codUbiPaisDomicilio;
	private String codUbiDepartamentoDomicilio;
	private String codUbiProvinciaDomicilio;
	private String codUbiDistritoDomicilio;
	private String codUbiLocalidadDomicilio;
	private String continenteDomicilio;
	private String paisDomicilio;
	private String departamentoDomicilio;
	private String provinciaDomicilio;
	private String distritoDomicilio;
	private String localidadDomicilio;
	private String estCivilCiudadano;
	private String codGradoInstruccion;
	private String genero;
	private String codUbiDepartamentoNacimiento;
	private String codUbiProvinciaNacimiento;
	private String codUbiDistritoNacimiento;
	private String departamentoNacimiento;
	private String provinciaNacimiento;
	private String distritoNacimiento;
	private String fecNacimiento;
	private String horNacimiento;
	private String pesNacido;
	private String tallaNacido;
	private String apgarUnoNacido;
	private String apgarCincoNacido;
	private String etnia;
	private String perCefalico;
	private String perToraxico;
	private String durEmbParto;
	private String atiendeParto;
	private String condicionParto;
	private String tipParto;
	private String financiadorParto;
	private String codLocal;
	private String codRenaes;
	private String codRenaesAdscrita;
	private String fecInscripcion;
	private String fecExpedicion;
	private String restriccion;
	private String prefijoDireccion;
	private String direccion;
	private String numDireccion;
	private String blockOchalet;
	private String prefijoBlockOchalet;
	private String interior;
	private String urbanizacion;
	private String etapa;
	private String manzana;
	private String lote;
	private String prefijoDptoPisoInterior;
	private String prefijoUrbCondResid;
	private byte[] imgFoto;
	
	public DatosReniecPersonaResp() {
		
	}

	public DatosReniecPersonaResp(String codRespuesta, String desRespuesta, String codOrigen, String desOrigen,
			String nroDocumento, String calidadMigratoria, String digVerificacion, String apePadre, String prenomPadre,
			String apeMadre, String tipDocMadre, String numDocMadre, String prenomMadre, String apeCasada,
			String prenombres, String codUbiContinenteDomicilio, String codUbiPaisDomicilio,
			String codUbiDepartamentoDomicilio, String codUbiProvinciaDomicilio, String codUbiDistritoDomicilio,
			String codUbiLocalidadDomicilio, String continenteDomicilio, String paisDomicilio,
			String departamentoDomicilio, String provinciaDomicilio, String distritoDomicilio,
			String localidadDomicilio, String estCivilCiudadano, String codGradoInstruccion, String genero,
			String codUbiDepartamentoNacimiento, String codUbiProvinciaNacimiento, String codUbiDistritoNacimiento,
			String departamentoNacimiento, String provinciaNacimiento, String distritoNacimiento, String fecNacimiento,
			String horNacimiento, String pesNacido, String tallaNacido, String apgarUnoNacido, String apgarCincoNacido,
			String etnia, String perCefalico, String perToraxico, String durEmbParto, String atiendeParto,
			String condicionParto, String tipParto, String financiadorParto, String codLocal, String codRenaes,
			String codRenaesAdscrita, String fecInscripcion, String fecExpedicion, String restriccion,
			String prefijoDireccion, String direccion, String numDireccion, String blockOchalet,
			String prefijoBlockOchalet, String interior, String urbanizacion, String etapa, String manzana, String lote,
			String prefijoDptoPisoInterior, String prefijoUrbCondResid, byte[] imgFoto) {
		
		this.codRespuesta = codRespuesta;
		this.desRespuesta = desRespuesta;
		this.codOrigen = codOrigen;
		this.desOrigen = desOrigen;
		this.nroDocumento = nroDocumento;
		this.calidadMigratoria = calidadMigratoria;
		this.digVerificacion = digVerificacion;
		this.apePadre = apePadre;
		this.prenomPadre = prenomPadre;
		this.apeMadre = apeMadre;
		this.tipDocMadre = tipDocMadre;
		this.numDocMadre = numDocMadre;
		this.prenomMadre = prenomMadre;
		this.apeCasada = apeCasada;
		this.prenombres = prenombres;
		this.codUbiContinenteDomicilio = codUbiContinenteDomicilio;
		this.codUbiPaisDomicilio = codUbiPaisDomicilio;
		this.codUbiDepartamentoDomicilio = codUbiDepartamentoDomicilio;
		this.codUbiProvinciaDomicilio = codUbiProvinciaDomicilio;
		this.codUbiDistritoDomicilio = codUbiDistritoDomicilio;
		this.codUbiLocalidadDomicilio = codUbiLocalidadDomicilio;
		this.continenteDomicilio = continenteDomicilio;
		this.paisDomicilio = paisDomicilio;
		this.departamentoDomicilio = departamentoDomicilio;
		this.provinciaDomicilio = provinciaDomicilio;
		this.distritoDomicilio = distritoDomicilio;
		this.localidadDomicilio = localidadDomicilio;
		this.estCivilCiudadano = estCivilCiudadano;
		this.codGradoInstruccion = codGradoInstruccion;
		this.genero = genero;
		this.codUbiDepartamentoNacimiento = codUbiDepartamentoNacimiento;
		this.codUbiProvinciaNacimiento = codUbiProvinciaNacimiento;
		this.codUbiDistritoNacimiento = codUbiDistritoNacimiento;
		this.departamentoNacimiento = departamentoNacimiento;
		this.provinciaNacimiento = provinciaNacimiento;
		this.distritoNacimiento = distritoNacimiento;
		this.fecNacimiento = fecNacimiento;
		this.horNacimiento = horNacimiento;
		this.pesNacido = pesNacido;
		this.tallaNacido = tallaNacido;
		this.apgarUnoNacido = apgarUnoNacido;
		this.apgarCincoNacido = apgarCincoNacido;
		this.etnia = etnia;
		this.perCefalico = perCefalico;
		this.perToraxico = perToraxico;
		this.durEmbParto = durEmbParto;
		this.atiendeParto = atiendeParto;
		this.condicionParto = condicionParto;
		this.tipParto = tipParto;
		this.financiadorParto = financiadorParto;
		this.codLocal = codLocal;
		this.codRenaes = codRenaes;
		this.codRenaesAdscrita = codRenaesAdscrita;
		this.fecInscripcion = fecInscripcion;
		this.fecExpedicion = fecExpedicion;
		this.restriccion = restriccion;
		this.prefijoDireccion = prefijoDireccion;
		this.direccion = direccion;
		this.numDireccion = numDireccion;
		this.blockOchalet = blockOchalet;
		this.prefijoBlockOchalet = prefijoBlockOchalet;
		this.interior = interior;
		this.urbanizacion = urbanizacion;
		this.etapa = etapa;
		this.manzana = manzana;
		this.lote = lote;
		this.prefijoDptoPisoInterior = prefijoDptoPisoInterior;
		this.prefijoUrbCondResid = prefijoUrbCondResid;
		this.imgFoto = imgFoto;
	}

	public String getCodRespuesta() {
		return codRespuesta;
	}

	public void setCodRespuesta(String codRespuesta) {
		this.codRespuesta = codRespuesta;
	}

	public String getDesRespuesta() {
		return desRespuesta;
	}

	public void setDesRespuesta(String desRespuesta) {
		this.desRespuesta = desRespuesta;
	}

	public String getCodOrigen() {
		return codOrigen;
	}

	public void setCodOrigen(String codOrigen) {
		this.codOrigen = codOrigen;
	}

	public String getDesOrigen() {
		return desOrigen;
	}

	public void setDesOrigen(String desOrigen) {
		this.desOrigen = desOrigen;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getCalidadMigratoria() {
		return calidadMigratoria;
	}

	public void setCalidadMigratoria(String calidadMigratoria) {
		this.calidadMigratoria = calidadMigratoria;
	}

	public String getDigVerificacion() {
		return digVerificacion;
	}

	public void setDigVerificacion(String digVerificacion) {
		this.digVerificacion = digVerificacion;
	}

	public String getApePadre() {
		return apePadre;
	}

	public void setApePadre(String apePadre) {
		this.apePadre = apePadre;
	}

	public String getPrenomPadre() {
		return prenomPadre;
	}

	public void setPrenomPadre(String prenomPadre) {
		this.prenomPadre = prenomPadre;
	}

	public String getApeMadre() {
		return apeMadre;
	}

	public void setApeMadre(String apeMadre) {
		this.apeMadre = apeMadre;
	}

	public String getTipDocMadre() {
		return tipDocMadre;
	}

	public void setTipDocMadre(String tipDocMadre) {
		this.tipDocMadre = tipDocMadre;
	}

	public String getNumDocMadre() {
		return numDocMadre;
	}

	public void setNumDocMadre(String numDocMadre) {
		this.numDocMadre = numDocMadre;
	}

	public String getPrenomMadre() {
		return prenomMadre;
	}

	public void setPrenomMadre(String prenomMadre) {
		this.prenomMadre = prenomMadre;
	}

	public String getApeCasada() {
		return apeCasada;
	}

	public void setApeCasada(String apeCasada) {
		this.apeCasada = apeCasada;
	}

	public String getPrenombres() {
		return prenombres;
	}

	public void setPrenombres(String prenombres) {
		this.prenombres = prenombres;
	}

	public String getCodUbiContinenteDomicilio() {
		return codUbiContinenteDomicilio;
	}

	public void setCodUbiContinenteDomicilio(String codUbiContinenteDomicilio) {
		this.codUbiContinenteDomicilio = codUbiContinenteDomicilio;
	}

	public String getCodUbiPaisDomicilio() {
		return codUbiPaisDomicilio;
	}

	public void setCodUbiPaisDomicilio(String codUbiPaisDomicilio) {
		this.codUbiPaisDomicilio = codUbiPaisDomicilio;
	}

	public String getCodUbiDepartamentoDomicilio() {
		return codUbiDepartamentoDomicilio;
	}

	public void setCodUbiDepartamentoDomicilio(String codUbiDepartamentoDomicilio) {
		this.codUbiDepartamentoDomicilio = codUbiDepartamentoDomicilio;
	}

	public String getCodUbiProvinciaDomicilio() {
		return codUbiProvinciaDomicilio;
	}

	public void setCodUbiProvinciaDomicilio(String codUbiProvinciaDomicilio) {
		this.codUbiProvinciaDomicilio = codUbiProvinciaDomicilio;
	}

	public String getCodUbiDistritoDomicilio() {
		return codUbiDistritoDomicilio;
	}

	public void setCodUbiDistritoDomicilio(String codUbiDistritoDomicilio) {
		this.codUbiDistritoDomicilio = codUbiDistritoDomicilio;
	}

	public String getCodUbiLocalidadDomicilio() {
		return codUbiLocalidadDomicilio;
	}

	public void setCodUbiLocalidadDomicilio(String codUbiLocalidadDomicilio) {
		this.codUbiLocalidadDomicilio = codUbiLocalidadDomicilio;
	}

	public String getContinenteDomicilio() {
		return continenteDomicilio;
	}

	public void setContinenteDomicilio(String continenteDomicilio) {
		this.continenteDomicilio = continenteDomicilio;
	}

	public String getPaisDomicilio() {
		return paisDomicilio;
	}

	public void setPaisDomicilio(String paisDomicilio) {
		this.paisDomicilio = paisDomicilio;
	}

	public String getDepartamentoDomicilio() {
		return departamentoDomicilio;
	}

	public void setDepartamentoDomicilio(String departamentoDomicilio) {
		this.departamentoDomicilio = departamentoDomicilio;
	}

	public String getProvinciaDomicilio() {
		return provinciaDomicilio;
	}

	public void setProvinciaDomicilio(String provinciaDomicilio) {
		this.provinciaDomicilio = provinciaDomicilio;
	}

	public String getDistritoDomicilio() {
		return distritoDomicilio;
	}

	public void setDistritoDomicilio(String distritoDomicilio) {
		this.distritoDomicilio = distritoDomicilio;
	}

	public String getLocalidadDomicilio() {
		return localidadDomicilio;
	}

	public void setLocalidadDomicilio(String localidadDomicilio) {
		this.localidadDomicilio = localidadDomicilio;
	}

	public String getEstCivilCiudadano() {
		return estCivilCiudadano;
	}

	public void setEstCivilCiudadano(String estCivilCiudadano) {
		this.estCivilCiudadano = estCivilCiudadano;
	}

	public String getCodGradoInstruccion() {
		return codGradoInstruccion;
	}

	public void setCodGradoInstruccion(String codGradoInstruccion) {
		this.codGradoInstruccion = codGradoInstruccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCodUbiDepartamentoNacimiento() {
		return codUbiDepartamentoNacimiento;
	}

	public void setCodUbiDepartamentoNacimiento(String codUbiDepartamentoNacimiento) {
		this.codUbiDepartamentoNacimiento = codUbiDepartamentoNacimiento;
	}

	public String getCodUbiProvinciaNacimiento() {
		return codUbiProvinciaNacimiento;
	}

	public void setCodUbiProvinciaNacimiento(String codUbiProvinciaNacimiento) {
		this.codUbiProvinciaNacimiento = codUbiProvinciaNacimiento;
	}

	public String getCodUbiDistritoNacimiento() {
		return codUbiDistritoNacimiento;
	}

	public void setCodUbiDistritoNacimiento(String codUbiDistritoNacimiento) {
		this.codUbiDistritoNacimiento = codUbiDistritoNacimiento;
	}

	public String getDepartamentoNacimiento() {
		return departamentoNacimiento;
	}

	public void setDepartamentoNacimiento(String departamentoNacimiento) {
		this.departamentoNacimiento = departamentoNacimiento;
	}

	public String getProvinciaNacimiento() {
		return provinciaNacimiento;
	}

	public void setProvinciaNacimiento(String provinciaNacimiento) {
		this.provinciaNacimiento = provinciaNacimiento;
	}

	public String getDistritoNacimiento() {
		return distritoNacimiento;
	}

	public void setDistritoNacimiento(String distritoNacimiento) {
		this.distritoNacimiento = distritoNacimiento;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getHorNacimiento() {
		return horNacimiento;
	}

	public void setHorNacimiento(String horNacimiento) {
		this.horNacimiento = horNacimiento;
	}

	public String getPesNacido() {
		return pesNacido;
	}

	public void setPesNacido(String pesNacido) {
		this.pesNacido = pesNacido;
	}

	public String getTallaNacido() {
		return tallaNacido;
	}

	public void setTallaNacido(String tallaNacido) {
		this.tallaNacido = tallaNacido;
	}

	public String getApgarUnoNacido() {
		return apgarUnoNacido;
	}

	public void setApgarUnoNacido(String apgarUnoNacido) {
		this.apgarUnoNacido = apgarUnoNacido;
	}

	public String getApgarCincoNacido() {
		return apgarCincoNacido;
	}

	public void setApgarCincoNacido(String apgarCincoNacido) {
		this.apgarCincoNacido = apgarCincoNacido;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public String getPerCefalico() {
		return perCefalico;
	}

	public void setPerCefalico(String perCefalico) {
		this.perCefalico = perCefalico;
	}

	public String getPerToraxico() {
		return perToraxico;
	}

	public void setPerToraxico(String perToraxico) {
		this.perToraxico = perToraxico;
	}

	public String getDurEmbParto() {
		return durEmbParto;
	}

	public void setDurEmbParto(String durEmbParto) {
		this.durEmbParto = durEmbParto;
	}

	public String getAtiendeParto() {
		return atiendeParto;
	}

	public void setAtiendeParto(String atiendeParto) {
		this.atiendeParto = atiendeParto;
	}

	public String getCondicionParto() {
		return condicionParto;
	}

	public void setCondicionParto(String condicionParto) {
		this.condicionParto = condicionParto;
	}

	public String getTipParto() {
		return tipParto;
	}

	public void setTipParto(String tipParto) {
		this.tipParto = tipParto;
	}

	public String getFinanciadorParto() {
		return financiadorParto;
	}

	public void setFinanciadorParto(String financiadorParto) {
		this.financiadorParto = financiadorParto;
	}

	public String getCodLocal() {
		return codLocal;
	}

	public void setCodLocal(String codLocal) {
		this.codLocal = codLocal;
	}

	public String getCodRenaes() {
		return codRenaes;
	}

	public void setCodRenaes(String codRenaes) {
		this.codRenaes = codRenaes;
	}

	public String getCodRenaesAdscrita() {
		return codRenaesAdscrita;
	}

	public void setCodRenaesAdscrita(String codRenaesAdscrita) {
		this.codRenaesAdscrita = codRenaesAdscrita;
	}

	public String getFecInscripcion() {
		return fecInscripcion;
	}

	public void setFecInscripcion(String fecInscripcion) {
		this.fecInscripcion = fecInscripcion;
	}

	public String getFecExpedicion() {
		return fecExpedicion;
	}

	public void setFecExpedicion(String fecExpedicion) {
		this.fecExpedicion = fecExpedicion;
	}

	public String getRestriccion() {
		return restriccion;
	}

	public void setRestriccion(String restriccion) {
		this.restriccion = restriccion;
	}

	public String getPrefijoDireccion() {
		return prefijoDireccion;
	}

	public void setPrefijoDireccion(String prefijoDireccion) {
		this.prefijoDireccion = prefijoDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumDireccion() {
		return numDireccion;
	}

	public void setNumDireccion(String numDireccion) {
		this.numDireccion = numDireccion;
	}

	public String getBlockOchalet() {
		return blockOchalet;
	}

	public void setBlockOchalet(String blockOchalet) {
		this.blockOchalet = blockOchalet;
	}

	public String getPrefijoBlockOchalet() {
		return prefijoBlockOchalet;
	}

	public void setPrefijoBlockOchalet(String prefijoBlockOchalet) {
		this.prefijoBlockOchalet = prefijoBlockOchalet;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getPrefijoDptoPisoInterior() {
		return prefijoDptoPisoInterior;
	}

	public void setPrefijoDptoPisoInterior(String prefijoDptoPisoInterior) {
		this.prefijoDptoPisoInterior = prefijoDptoPisoInterior;
	}

	public String getPrefijoUrbCondResid() {
		return prefijoUrbCondResid;
	}

	public void setPrefijoUrbCondResid(String prefijoUrbCondResid) {
		this.prefijoUrbCondResid = prefijoUrbCondResid;
	}

	public byte[] getImgFoto() {
		return imgFoto;
	}

	public void setImgFoto(byte[] imgFoto) {
		this.imgFoto = imgFoto;
	}

	@Override
	public String toString() {
		return "DatosReniecPersona [codRespuesta=" + codRespuesta + ", desRespuesta=" + desRespuesta + ", codOrigen="
				+ codOrigen + ", desOrigen=" + desOrigen + ", nroDocumento=" + nroDocumento + ", calidadMigratoria="
				+ calidadMigratoria + ", digVerificacion=" + digVerificacion + ", apePadre=" + apePadre
				+ ", prenomPadre=" + prenomPadre + ", apeMadre=" + apeMadre + ", tipDocMadre=" + tipDocMadre
				+ ", numDocMadre=" + numDocMadre + ", prenomMadre=" + prenomMadre + ", apeCasada=" + apeCasada
				+ ", prenombres=" + prenombres + ", codUbiContinenteDomicilio=" + codUbiContinenteDomicilio
				+ ", codUbiPaisDomicilio=" + codUbiPaisDomicilio + ", codUbiDepartamentoDomicilio="
				+ codUbiDepartamentoDomicilio + ", codUbiProvinciaDomicilio=" + codUbiProvinciaDomicilio
				+ ", codUbiDistritoDomicilio=" + codUbiDistritoDomicilio + ", codUbiLocalidadDomicilio="
				+ codUbiLocalidadDomicilio + ", continenteDomicilio=" + continenteDomicilio + ", paisDomicilio="
				+ paisDomicilio + ", departamentoDomicilio=" + departamentoDomicilio + ", provinciaDomicilio="
				+ provinciaDomicilio + ", distritoDomicilio=" + distritoDomicilio + ", localidadDomicilio="
				+ localidadDomicilio + ", estCivilCiudadano=" + estCivilCiudadano + ", codGradoInstruccion="
				+ codGradoInstruccion + ", genero=" + genero + ", codUbiDepartamentoNacimiento="
				+ codUbiDepartamentoNacimiento + ", codUbiProvinciaNacimiento=" + codUbiProvinciaNacimiento
				+ ", codUbiDistritoNacimiento=" + codUbiDistritoNacimiento + ", departamentoNacimiento="
				+ departamentoNacimiento + ", provinciaNacimiento=" + provinciaNacimiento + ", distritoNacimiento="
				+ distritoNacimiento + ", fecNacimiento=" + fecNacimiento + ", horNacimiento=" + horNacimiento
				+ ", pesNacido=" + pesNacido + ", tallaNacido=" + tallaNacido + ", apgarUnoNacido=" + apgarUnoNacido
				+ ", apgarCincoNacido=" + apgarCincoNacido + ", etnia=" + etnia + ", perCefalico=" + perCefalico
				+ ", perToraxico=" + perToraxico + ", durEmbParto=" + durEmbParto + ", atiendeParto=" + atiendeParto
				+ ", condicionParto=" + condicionParto + ", tipParto=" + tipParto + ", financiadorParto="
				+ financiadorParto + ", codLocal=" + codLocal + ", codRenaes=" + codRenaes + ", codRenaesAdscrita="
				+ codRenaesAdscrita + ", fecInscripcion=" + fecInscripcion + ", fecExpedicion=" + fecExpedicion
				+ ", restriccion=" + restriccion + ", prefijoDireccion=" + prefijoDireccion + ", direccion=" + direccion
				+ ", numDireccion=" + numDireccion + ", blockOchalet=" + blockOchalet + ", prefijoBlockOchalet="
				+ prefijoBlockOchalet + ", interior=" + interior + ", urbanizacion=" + urbanizacion + ", etapa=" + etapa
				+ ", manzana=" + manzana + ", lote=" + lote + ", prefijoDptoPisoInterior=" + prefijoDptoPisoInterior
				+ ", prefijoUrbCondResid=" + prefijoUrbCondResid + ", imgFoto=" + Arrays.toString(imgFoto) + "]";
	}

}
