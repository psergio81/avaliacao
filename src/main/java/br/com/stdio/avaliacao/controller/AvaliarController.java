package br.com.stdio.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.stdio.avaliacao.model.AvaliacaoResposta;
import br.com.stdio.avaliacao.repository.AvaliacaoRespostas;

@Controller

public class AvaliarController {

	@Autowired
	private AvaliacaoRespostas avaliacaoRespostas;
	
	@RequestMapping("/login")
	public ModelAndView loginAvaliar(){
		
		ModelAndView mv = new ModelAndView("Login");
		
		
		return mv;
		
	}
	
	@RequestMapping("/minhasAvaliacoes")
	public ModelAndView minhasAvaliacoes(){
		
		ModelAndView mv = new ModelAndView("MinhasAvaliacoes");
		
		List<AvaliacaoResposta> todasAvaliacoes = avaliacaoRespostas.findAll();
		
		for (AvaliacaoResposta avaliacaoResposta : todasAvaliacoes) {
			System.out.println(avaliacaoResposta.getAvaliador().getNome());
		}
		
		
		return mv;
	}
	
}
