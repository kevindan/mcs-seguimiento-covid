package pe.gob.minsa.covid.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.minsa.covid.model.UbigeoCasos;

public interface UbigeoCasosRepository extends CrudRepository<UbigeoCasos, Long>{
	
	List<UbigeoCasos> findByEstadoOrderByUbigeo(String estado);

}
