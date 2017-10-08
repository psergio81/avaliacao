package br.com.stdio.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.model.Questao;
import br.com.stdio.avaliacao.repository.Questoes;

@Service
public class QuestaoService {

	@Autowired
	Questoes questoes;
	
	public List<Questao> getTodasQuestoess() {
		return questoes.findAll();
	}

	public void salvar(Questao questao) {
		questoes.save(questao);
	}

	public Questao getQuestao(Long codigo) {
		return questoes.getOne(codigo);
	}

	public void excluir(Long codigo) {
		questoes.delete(codigo);
	}

}
