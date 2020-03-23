package pe.gob.minsa.covid.service;

import java.util.List;

import pe.gob.minsa.covid.bean.RequestRegistroBean;
import pe.gob.minsa.covid.bean.ResponseRegistroBean;
import pe.gob.minsa.covid.model.Pais;

public interface SeguimientoService {
	public List<Pais> listaPaises();
	public ResponseRegistroBean registraCaso(RequestRegistroBean requestRegistroBean);
}
