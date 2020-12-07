package com.trevorramsey.dojo.Controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trevorramsey.dojo.Models.Dojo;
import com.trevorramsey.dojo.Models.Ninja;
import com.trevorramsey.dojo.Services.DNService;

@Controller
public class HomeController {
	private DNService dService;
	public HomeController(DNService service) {
		this.dService = service;
	}
	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	@RequestMapping("/dojos/new")
		public String dojo(@ModelAttribute("dojo") Dojo dojo ) {
			return "newDojo.jsp";
	}
	@PostMapping("/dojos")
		public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo) {
			this.dService.createDojo(dojo);
			return "redirect:/ninjas/new";
	}
	@RequestMapping("/ninjas/new")
		public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
			model.addAttribute("dojos",this.dService.getAllDojo());
			return "newNinja.jsp";
	}
	@PostMapping("/ninjas")
		public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja) {
			this.dService.createNinja(ninja);
			return "redirect:/ninjas/new";
	}
	@RequestMapping("/dojos/{id}")
		public String showDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo",this.dService.getDojoById(id));
		return "show.jsp";
		
	}
	

}
