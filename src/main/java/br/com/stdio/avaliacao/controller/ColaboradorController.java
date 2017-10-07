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
import br.com.stdio.avaliacao.model.Colaborador;
import br.com.stdio.avaliacao.repository.Colaboradores;

@Controller
@RequestMapping("/colaboradores")
public class ColaboradorController {

	@Autowired
	private Colaboradores colaboradores;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroColaborador");
		mv.addObject("colaborador", new Colaborador());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Colaborador> todosColaboradores = colaboradores.findAll();
		
		ModelAndView mv = new ModelAndView("PesquisaColaborador");
		mv.addObject("colaboradores", todosColaboradores);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Colaborador colaborador, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroColaborador");

		if (errors.hasErrors()) {
			return mv;
		}
		
		
		colaboradores.save(colaborador);
		
		mv.addObject("mensagem", "Colaborador salvo com sucesso!");
		
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicao(@PathVariable Long codigo){
	
		ModelAndView mv = new ModelAndView("CadastroColaborador");
		
		Colaborador colaborador = colaboradores.getOne(codigo);
		
		mv.addObject("colaborador", colaborador);
		
		return mv;
	}
	
	@RequestMapping(value="{codigo}", method = RequestMethod.DELETE)
	public String excluir(@PathVariable Long codigo){
		
		colaboradores.delete(codigo);
		
		
		return "redirect:/colaboradores";
	}
	
	
	@ModelAttribute("niveisHierarquicos")
	public List<NivelHierarquico> niveisHierarquicos(){
		return Arrays.asList(NivelHierarquico.values());
	}
	
}
