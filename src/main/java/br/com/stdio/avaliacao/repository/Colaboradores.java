package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Colaborador;

public interface Colaboradores extends JpaRepository<Colaborador, Long> {

}
