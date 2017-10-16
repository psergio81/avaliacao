package br.com.stdio.avaliacao.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;
import br.com.stdio.avaliacao.enumerate.TipoSelecao;
import br.com.stdio.avaliacao.model.Avaliacao;
import br.com.stdio.avaliacao.model.AvaliacaoAvaliador;
import br.com.stdio.avaliacao.model.AvaliacaoResposta;
import br.com.stdio.avaliacao.model.Colaborador;
import br.com.stdio.avaliacao.model.Questao;
import br.com.stdio.avaliacao.model.Questionario;
import br.com.stdio.avaliacao.repository.AvaliacaoRespostas;
import br.com.stdio.avaliacao.repository.Avaliacoes;

@Service
public class AvaliacaoService {
	
	@Autowired
	private Avaliacoes avaliacoes;

	@Autowired
	private AvaliacaoRespostas avaliacaoRespostas;
	
	@Autowired
	private ColaboradorService colaboradorService;

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

	public void gerarAvaliacao(Long codigo) {

		Avaliacao avaliacao = avaliacoes.getOne(codigo);
		List<Questao> questoes = getQuestoes(avaliacao);
		
		
		List<AvaliacaoAvaliador> detalhes = avaliacao.getDetalhes();
		
		for (AvaliacaoAvaliador avaliacaoAvaliador : detalhes) {

			int quantidadeAvaliadores = avaliacaoAvaliador.getQuantidadeAvaliadores();
			NivelHierarquico nivelAvaliado = avaliacaoAvaliador.getNivelAvaliado();
			NivelHierarquico nivelAvaliador = avaliacaoAvaliador.getNivelAvaliador();

			TipoSelecao tipoSelecao = avaliacaoAvaliador.getTipoSelecao();
			List<Colaborador> colaboradoresAvaliados = colaboradorService.getColaboradorPeloNivel(nivelAvaliado);
			
			for (Colaborador colaborador : colaboradoresAvaliados) {

				List<Colaborador> avaliadores = getAvaliadores(quantidadeAvaliadores, nivelAvaliador, colaborador, tipoSelecao);
				
				for (Colaborador avaliador : avaliadores) {
					System.out.println(">>>> "+avaliador.getNome()+" avalia "+colaborador.getNome());
	
					AvaliacaoResposta avaliacaoResposta = new AvaliacaoResposta();
					avaliacaoResposta.setAvaliacao(avaliacao);
					avaliacaoResposta.setColaborador(colaborador);
					avaliacaoResposta.setAvaliador(avaliador);
					
					avaliacaoRespostas.save(avaliacaoResposta);
					
				}
			}
			
		}
		
	}

	private List<Questao> getQuestoes(Avaliacao avaliacao) {

		List<Questao> retorno = new ArrayList<Questao>();
			
		for (Questionario questionario : avaliacao.getQuestionarios()) {
			retorno.addAll(questionario.getQuestoes());
		}
		
		
		return retorno;
	}

	private List<Colaborador> getAvaliadores(int quantidadeAvaliadores, NivelHierarquico nivelAvaliador, Colaborador colaborador, TipoSelecao tipoSelecao) {
		
		if (TipoSelecao.AUTO_AVALIACAO.equals(tipoSelecao)) {
			return Arrays.asList(colaborador);
		}
		
		List<Colaborador> avaliadores = colaboradorService.getColaboradorPeloNivel(nivelAvaliador);
		
		avaliadores.remove(colaborador);
		
		int size = avaliadores.size();
		
		if(quantidadeAvaliadores > size){
			quantidadeAvaliadores = size;
		}
		
		Collections.shuffle(avaliadores);
		
		return avaliadores.subList(0, quantidadeAvaliadores);
	}
	
}
