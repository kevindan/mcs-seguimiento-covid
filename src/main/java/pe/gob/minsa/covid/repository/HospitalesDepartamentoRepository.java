package pe.gob.minsa.covid.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.minsa.covid.model.HospitalesDepartamento;

public interface HospitalesDepartamentoRepository extends CrudRepository<HospitalesDepartamento, Long> {

	List<HospitalesDepartamento> findByDepartamentoId(String departamentoId);
		
}
