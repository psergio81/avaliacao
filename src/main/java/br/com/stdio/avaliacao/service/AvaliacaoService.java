package br.com.stdio.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.model.Avaliacao;
import br.com.stdio.avaliacao.repository.Avaliacoes;

@Service
public class AvaliacaoService {
	
	@Autowired
	private Avaliacoes avaliacoes;

	public void salvar(Avaliacao avaliacao) {
		avaliacoes.save(avaliacao);
	}

	public List<Avaliacao> getTodasAvaliacoes() {
		return avaliacoes.findAll();
	}

	public Avaliacao getAvaliacao(Long codigo) {
		Avaliacao findOne = avaliacoes.findOne(codigo);
		
		return findOne;
	}

	public void excluir(Long codigo) {

		avaliacoes.delete(codigo);
		
	}

	
	
	
}
