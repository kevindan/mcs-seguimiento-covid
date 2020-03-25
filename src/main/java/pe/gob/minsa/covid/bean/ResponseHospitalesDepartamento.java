package pe.gob.minsa.covid.bean;

import java.util.List;

import pe.gob.minsa.covid.model.HospitalesDepartamento;

public class ResponseHospitalesDepartamento {

	private String codigo;
	private List<HospitalesDepartamento> hospitales;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<HospitalesDepartamento> getHospitales() {
		return hospitales;
	}
	public void setHospitales(List<HospitalesDepartamento> hospitales) {
		this.hospitales = hospitales;
	}
	
	
}
