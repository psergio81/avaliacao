package br.com.stdio.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.model.Cargo;

public interface Cargos extends JpaRepository<Cargo, Long> {

}
