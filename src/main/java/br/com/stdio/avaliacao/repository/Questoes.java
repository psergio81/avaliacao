package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Questao;

public interface Questoes extends JpaRepository<Questao, Long> {

}
