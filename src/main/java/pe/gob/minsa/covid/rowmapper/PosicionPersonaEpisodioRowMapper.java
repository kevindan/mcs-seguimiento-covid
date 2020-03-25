package pe.gob.minsa.covid.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.gob.minsa.covid.model.PosicionPersonaEpisodio;

public class PosicionPersonaEpisodioRowMapper implements RowMapper<PosicionPersonaEpisodio> {

	@Override
	public PosicionPersonaEpisodio mapRow(ResultSet rs, int rowNum) throws SQLException {
		PosicionPersonaEpisodio posicion = new PosicionPersonaEpisodio();
		posicion.setId_persona_episodio_seguimiento(rs.getLong("v_id_persona_episodio_seguimiento"));
		posicion.setId_persona_episodio(rs.getLong("v_id_persona_episodio"));
		posicion.setLongitud(rs.getString("v_longitud"));
		posicion.setLatitud(rs.getString("v_latitud"));
		posicion.setEst_registro(rs.getString("v_est_registro"));
		posicion.setFec_registro(rs.getString("v_fec_registro"));
		posicion.setUsr_registro(rs.getString("v_usr_registro"));
		posicion.setFec_update(rs.getString("v_fec_update"));
		posicion.setUsr_update(rs.getString("v_usr_update"));
		return posicion;
	}

}
