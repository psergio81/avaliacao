package br.com.stdio.avaliacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	
	@RequestMapping
	public ModelAndView pesquisar(){

		ModelAndView mv = new ModelAndView("Dashboard");
		
		return mv;
	}
	
}
