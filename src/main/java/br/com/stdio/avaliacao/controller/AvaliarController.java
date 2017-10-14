package br.com.stdio.avaliacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AvaliarController {

	@RequestMapping("/login")
	public ModelAndView loginAvaliar(){
		
		ModelAndView mv = new ModelAndView("Login");
		
		
		return mv;
		
	}
	
	@RequestMapping("/minhasAvaliacoes")
	public ModelAndView minhasAvaliacoes(){
		
		ModelAndView mv = new ModelAndView("MinhasAvaliacoes");
		
		
		return mv;
	}
	
}
