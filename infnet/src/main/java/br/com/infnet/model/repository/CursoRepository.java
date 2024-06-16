package br.com.infnet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.infnet.model.domain.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
