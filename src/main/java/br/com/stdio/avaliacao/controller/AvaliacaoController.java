package br.com.stdio.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.stdio.avaliacao.model.Avaliacao;
import br.com.stdio.avaliacao.repository.Avaliacoes;

@Controller
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

	@Autowired
	private Avaliacoes avaliacoes;
	
	@RequestMapping("/nova")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroAvaliacao");
		mv.addObject("avaliacao", new Avaliacao());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Avaliacao> todasAvaliacoes = avaliacoes.findAll();
		
		ModelAndView mv = new ModelAndView("PesquisaAvaliacao");
		mv.addObject("avaliacoes", todasAvaliacoes);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Avaliacao avaliacao, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroAvaliacao");

		if (errors.hasErrors()) {
			return mv;
		}
		
		
		avaliacoes.save(avaliacao);
		
		mv.addObject("mensagem", "Avaliação salva com sucesso!");
		
		return mv;
	}
	
}
