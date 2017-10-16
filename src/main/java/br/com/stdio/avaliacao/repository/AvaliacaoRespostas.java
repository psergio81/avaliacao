package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.AvaliacaoResposta;

public interface AvaliacaoRespostas extends JpaRepository<AvaliacaoResposta, Long> {

}
