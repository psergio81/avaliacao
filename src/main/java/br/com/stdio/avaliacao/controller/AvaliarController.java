package br.com.stdio.avaliacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/avaliar")
public class AvaliarController {

	
	@RequestMapping
	public ModelAndView loginAvaliar(){
		
		ModelAndView mv = new ModelAndView("Login");
		
		
		return mv;
		
	}
	
}
