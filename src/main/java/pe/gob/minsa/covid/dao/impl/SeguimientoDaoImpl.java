package pe.gob.minsa.covid.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.gob.minsa.covid.bean.RequestRegistroBean;
import pe.gob.minsa.covid.dao.SeguimientoDao;
import pe.gob.minsa.covid.model.Pais;
import pe.gob.minsa.covid.model.PosicionPersonaEpisodio;
import pe.gob.minsa.covid.rowmapper.PaisRowMapper;
import pe.gob.minsa.covid.rowmapper.PosicionPersonaEpisodioRowMapper;

@Transactional
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

	@Override
	public String registraCaso(RequestRegistroBean resquestBean) {
		String resp = "0000";
		ObjectMapper mapper = new ObjectMapper();
		Map<String , Object> out = new HashMap<String, Object>();
		try {
			String json = mapper.writeValueAsString(resquestBean);
			logger.debug("Json de entrada :"+json);
			String sql = "select * from public.sp_registro_seguimiento('"+json+"')";
			out = getJdbcTemplate().queryForMap(sql);
			System.out.println(out.toString());
			resp = (String) out.get("sp_registro_seguimiento");
			logger.debug("Mensaje del SP : "+resp);
		} catch (Exception e) {
			logger.error(e.getMessage());
			resp = "9000";
		}
		return resp;
	}
	@Override
	public List<PosicionPersonaEpisodio> listarPosicion() {
		List<PosicionPersonaEpisodio> lista = new ArrayList<PosicionPersonaEpisodio>();
		String sql = "select * from  public.sp_listar_posicion();";
		
		try {
			
			RowMapper<PosicionPersonaEpisodio> rowLista = new PosicionPersonaEpisodioRowMapper();
			
			lista = getJdbcTemplate().query(sql,rowLista);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			
		}
				
		return lista ;
	}

}
