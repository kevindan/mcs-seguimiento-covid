package pe.gob.minsa.covid.bean;

import java.io.Serializable;

public class ConsultaMPIReq implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipDocumento;
	private String nroDocumento;

	public ConsultaMPIReq(String tipDocumento, String nroDocumento) {
		
		this.tipDocumento = tipDocumento;
		this.nroDocumento = nroDocumento;
	}

	public ConsultaMPIReq() {
		
	}

	public String getTipDocumento() {
		return tipDocumento;
	}

	public void setTipDocumento(String tipDocumento) {
		this.tipDocumento = tipDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	@Override
	public String toString() {
		return "ConsultaMPIReq [tipDocumento=" + tipDocumento + ", nroDocumento=" + nroDocumento + "]";
	}

}
