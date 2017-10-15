package br.com.stdio.avaliacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;
import br.com.stdio.avaliacao.model.Colaborador;

public interface Colaboradores extends JpaRepository<Colaborador, Long> {

	
	List<Colaborador> findAllByNivelHierarquico(NivelHierarquico hierarquico);
	
}
