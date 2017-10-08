package br.com.stdio.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.model.Criterio;
import br.com.stdio.avaliacao.repository.Criterios;

@Service
public class CriterioService {

	@Autowired
	Criterios criterios;
	
	public List<Criterio> getTodosCriterios() {
		return criterios.findAll();
	}

	public void salvar(Criterio criterio) {
		criterios.save(criterio);
	}

	public Criterio getCriterio(Long codigo) {
		return criterios.getOne(codigo);
	}

	public void excluir(Long codigo) {
		criterios.delete(codigo);
	}

}
