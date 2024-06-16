package br.com.infnet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.infnet.model.domain.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
