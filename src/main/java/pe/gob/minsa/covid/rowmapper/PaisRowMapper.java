package pe.gob.minsa.covid.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.gob.minsa.covid.model.Pais;

public class PaisRowMapper implements RowMapper<Pais>{

	@Override
	public Pais mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pais pais = new Pais();
		pais.setPasi_id(rs.getString("pais_id"));
		pais.setDescripcion(rs.getString("descripcion"));
		return pais;
	}
	
	

}
