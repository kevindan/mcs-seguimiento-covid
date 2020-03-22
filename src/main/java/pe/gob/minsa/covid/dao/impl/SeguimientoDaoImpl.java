package pe.gob.minsa.covid.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.gob.minsa.covid.dao.SeguimientoDao;
import pe.gob.minsa.covid.model.Pais;
import pe.gob.minsa.covid.rowmapper.PaisRowMapper;

@Repository
public class SeguimientoDaoImpl extends JdbcDaoSupport implements SeguimientoDao {

	@Autowired
	public SeguimientoDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<Pais> listaPaises() {
		List<Pais> paises = new ArrayList<Pais>();
		String sql = "SELECT pais_id, descripcion FROM public.tbl_paises order by descripcion asc";
		try {
			RowMapper<Pais> rowPais = new PaisRowMapper();
			paises = getJdbcTemplate().query(sql, rowPais);
		} catch (Exception e) {
			logger.error(e.getMessage());			
		}
		return paises;
	}

}
