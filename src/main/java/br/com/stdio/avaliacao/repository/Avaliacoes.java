package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Avaliacao;

public interface Avaliacoes extends JpaRepository<Avaliacao, Long> {

}
