package br.com.stdio.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;
import br.com.stdio.avaliacao.model.Colaborador;
import br.com.stdio.avaliacao.repository.Colaboradores;

@Service
public class ColaboradorService {

	@Autowired
	Colaboradores colaboradores;
	
	public List<Colaborador> getTodosColaboradores() {
		return colaboradores.findAll();
	}

	public Colaborador getColaborador(Long codigo) {
		return colaboradores.getOne(codigo);
	}

	public void excluir(Long codigo) {
		colaboradores.delete(codigo);
	}

	public void salvar(Colaborador colaborador) {
		colaboradores.save(colaborador);
	}

	public List<Colaborador> getColaboradorPeloNivel(NivelHierarquico nivelHierarquico) {
		return colaboradores.findAllByNivelHierarquico(nivelHierarquico);
	}

}
