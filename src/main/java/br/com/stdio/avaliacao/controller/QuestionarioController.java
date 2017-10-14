package br.com.stdio.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.stdio.avaliacao.model.Questionario;
import br.com.stdio.avaliacao.service.QuestionarioService;

@Controller
@RequestMapping("/questionarios")
public class QuestionarioController {

	@Autowired
	private QuestionarioService questionarioService;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroQuestionario");
		mv.addObject("questionario", new Questionario());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Questionario> todosQuestionarios = questionarioService.getTodosQuestionarios();
		
		ModelAndView mv = new ModelAndView("PesquisaQuestionario");
		mv.addObject("questionarios", todosQuestionarios);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Questionario questionario, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroQuestionario");

		if (errors.hasErrors()) {
			return mv;
		}
		
		questionarioService.salvar(questionario);
		
		Questionario questionarioSalvo = questionarioService.getQuestionario(questionario.getCodigo());
		
		mv.addObject("mensagem", "Questionario salvo com sucesso!");
		mv.addObject("questionario", questionarioSalvo);
		
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicao(@PathVariable Long codigo){
	
		ModelAndView mv = new ModelAndView("CadastroQuestionario");
		
		Questionario questionario = questionarioService.getQuestionario(codigo);
		
		mv.addObject("questionario", questionario);
		
		return mv;
	}
	
	@RequestMapping(value="{codigo}", method = RequestMethod.DELETE)
	public String excluir(@PathVariable Long codigo){
		
		questionarioService.excluir(codigo);
		
		return "redirect:/questionarios";
	}
	
	
}
