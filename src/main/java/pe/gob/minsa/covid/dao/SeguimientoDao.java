package pe.gob.minsa.covid.dao;

import java.util.List;

import pe.gob.minsa.covid.bean.RequestRegistroBean;
import pe.gob.minsa.covid.model.Pais;

public interface SeguimientoDao {
	
	public List<Pais> listaPaises();
	public String registraCaso(RequestRegistroBean resquestBean);

}
