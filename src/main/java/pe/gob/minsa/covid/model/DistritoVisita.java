package pe.gob.minsa.covid.model;

import java.io.Serializable;

public class DistritoVisita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String distrito;
	
	public DistritoVisita() {
		
	}

	public DistritoVisita(String distrito) {
		this.distrito = distrito;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	@Override
	public String toString() {
		return "DistritoVisita [distrito=" + distrito + "]";
	}
	
}
