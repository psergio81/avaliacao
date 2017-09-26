package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Criterio;

public interface Criterios extends JpaRepository<Criterio, Long> {

}
