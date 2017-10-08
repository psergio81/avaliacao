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

import br.com.stdio.avaliacao.model.Cargo;
import br.com.stdio.avaliacao.service.CargoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@Autowired
	private CargoService cargoService;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroCargo");
		mv.addObject("cargo", new Cargo());
		
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){

		List<Cargo> todosCargos = cargoService.getTodosCargos();
		
		ModelAndView mv = new ModelAndView("PesquisaCargo");
		mv.addObject("cargos", todosCargos);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Cargo cargo, Errors errors){

		ModelAndView mv = new ModelAndView("CadastroCargo");

		if (errors.hasErrors()) {
			return mv;
		}
		
		cargoService.salvar(cargo);
		
		mv.addObject("mensagem", "Cargo salvo com sucesso!");
		
		return mv;
	}
	
	@RequestMapping("{codigo}")
	public ModelAndView edicao(@PathVariable Long codigo){
	
		ModelAndView mv = new ModelAndView("CadastroCargo");
		
		Cargo cargo = cargoService.getCargo(codigo);
		
		mv.addObject("cargo", cargo);
		
		return mv;
	}
	
	@RequestMapping(value="{codigo}", method = RequestMethod.DELETE)
	public String excluir(@PathVariable Long codigo){
		
		cargoService.excluir(codigo);
		
		return "redirect:/cargos";
	}
	
	
}
