package br.com.stdio.avaliacao.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.stdio.avaliacao.enumerate.TipoQuestao;
import br.com.stdio.avaliacao.enumerate.TipoResposta;
import br.com.stdio.avaliacao.model.Questao;
import br.com.stdio.avaliacao.service.QuestaoService;

@Controller
@RequestMapping("/questoes")
public class QuestaoController {

	@Autowired
	private QuestaoService questaoService;
	
	@RequestMapping("/nova")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroQuestao");
		mv.addObject("questao", new Questao());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Questao> todasQuestoes = questaoService.getTodasQuestoess();
		
		ModelAndView mv = new ModelAndView("PesquisaQuestao");
		mv.addObject("questoes", todasQuestoes);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Questao questao, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroQuestao");

		if (errors.hasErrors()) {
			return mv;
		}
		
		
		questaoService.salvar(questao);
		
		mv.addObject("mensagem", "Questao salva com sucesso!");
		
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicao(@PathVariable Long codigo){
	
		ModelAndView mv = new ModelAndView("CadastroQuestao");
		
		Questao questao = questaoService.getQuestao(codigo);
		
		mv.addObject("questao", questao);
		
		return mv;
	}
	
	@RequestMapping(value="{codigo}", method = RequestMethod.DELETE)
	public String excluir(@PathVariable Long codigo){
		
		questaoService.excluir(codigo);
		
		return "redirect:/questoes";
	}
	
	@ModelAttribute("tiposQuestoes")
	public List<TipoQuestao> tiposQuestoes(){
		return Arrays.asList(TipoQuestao.values());
	}
	
	@ModelAttribute("tiposRespostas")
	public List<TipoResposta> tiposRespostas(){
		return Arrays.asList(TipoResposta.values());
	}
	
	
}
