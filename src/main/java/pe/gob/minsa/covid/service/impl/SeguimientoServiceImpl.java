package pe.gob.minsa.covid.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minsa.covid.bean.RequestRegistroBean;
import pe.gob.minsa.covid.bean.ResponseRegistroBean;
import pe.gob.minsa.covid.dao.SeguimientoDao;
import pe.gob.minsa.covid.model.Pais;
import pe.gob.minsa.covid.service.SeguimientoService;

@Service
public class SeguimientoServiceImpl implements SeguimientoService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SeguimientoDao _seguimientoDao;
	
	@Override
	public List<Pais> listaPaises() {
		List<Pais> paises = new ArrayList<Pais>();
		try {
			paises = _seguimientoDao.listaPaises();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return paises;
	}

	@Override
	public ResponseRegistroBean registraCaso(RequestRegistroBean requestRegistroBean) {
		ResponseRegistroBean response = new ResponseRegistroBean();
		try {
			response.setCodigo(_seguimientoDao.registraCaso(requestRegistroBean));
		} catch (Exception e) {
			logger.error(e.getMessage());
			response.setCodigo("9000");
		}
		return response;
	}

}
