package br.com.stdio.avaliacao.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.stdio.avaliacao.enumerate.TipoCriterio;
import br.com.stdio.avaliacao.enumerate.TipoResposta;
import br.com.stdio.avaliacao.model.Criterio;
import br.com.stdio.avaliacao.repository.Criterios;

@Controller
@RequestMapping("/criterios")
public class CriterioController {

	@Autowired
	private Criterios criterios;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroCriterio");
		mv.addObject("criterio", new Criterio());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Criterio> todosCriterios = criterios.findAll();
		
		ModelAndView mv = new ModelAndView("PesquisaCriterio");
		mv.addObject("criterios", todosCriterios);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Criterio criterio, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroCriterio");

		if (errors.hasErrors()) {
			return mv;
		}
		
		
		criterios.save(criterio);
		
		mv.addObject("mensagem", "Criterio salvo com sucesso!");
		
		return mv;
	}
	
	
	@ModelAttribute("tiposCriterios")
	public List<TipoCriterio> tiposCriterios(){
		return Arrays.asList(TipoCriterio.values());
	}
	
	@ModelAttribute("tiposRespostas")
	public List<TipoResposta> tiposRespostas(){
		return Arrays.asList(TipoResposta.values());
	}
	
	
}
