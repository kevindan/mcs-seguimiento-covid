package pe.gob.minsa.covid.repository;

import org.springframework.data.repository.CrudRepository;

import  pe.gob.minsa.covid.model.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento,Long> {

}
