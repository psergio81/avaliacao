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

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;
import br.com.stdio.avaliacao.enumerate.TipoSelecao;
import br.com.stdio.avaliacao.model.Avaliacao;
import br.com.stdio.avaliacao.model.AvaliacaoAvaliador;
import br.com.stdio.avaliacao.service.AvaliacaoService;

@Controller
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

	private static final String AVALIACAO_VIEW = "CadastroAvaliacao";
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@RequestMapping("/nova")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView(AVALIACAO_VIEW);
		mv.addObject("avaliacao", new Avaliacao());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Avaliacao> todasAvaliacoes = avaliacaoService.getTodasAvaliacoes();
		
		ModelAndView mv = new ModelAndView("PesquisaAvaliacao");
		mv.addObject("avaliacoes", todasAvaliacoes);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Avaliacao avaliacao, Errors errors){

		ModelAndView mv = new ModelAndView(AVALIACAO_VIEW);

		List<AvaliacaoAvaliador> detalhes = avaliacao.getDetalhes();
		for (AvaliacaoAvaliador avaliacaoAvaliador : detalhes) {
			avaliacaoAvaliador.setAvaliacao(avaliacao);
		}
		
		if (errors.hasErrors()) {
			return mv;
		}
		
		avaliacaoService.salvar(avaliacao);
		
		mv.addObject("mensagem", "Avaliação salva com sucesso!");
		
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicao(@PathVariable Long codigo){
	
		ModelAndView mv = new ModelAndView(AVALIACAO_VIEW);
		
		Avaliacao avaliacao = avaliacaoService.getAvaliacao(codigo);
		
		mv.addObject("avaliacao", avaliacao);
		
		return mv;
	}
	
	@RequestMapping(value="{codigo}", method = RequestMethod.DELETE)
	public String excluir(@PathVariable Long codigo){
		
		avaliacaoService.excluir(codigo);
		
		
		return "redirect:/avaliacoes";
	}
	
	
	
	@ModelAttribute("niveisHierarquicos")
	public List<NivelHierarquico> niveisHierarquicos(){
		return Arrays.asList(NivelHierarquico.values());
	}
	
	@ModelAttribute("tiposSelecoes")
	public List<TipoSelecao> tiposSelecao(){
		return Arrays.asList(TipoSelecao.values());
	}
	
}
