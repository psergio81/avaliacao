package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Questionario;

public interface Questionarios extends JpaRepository<Questionario, Long> {

}
