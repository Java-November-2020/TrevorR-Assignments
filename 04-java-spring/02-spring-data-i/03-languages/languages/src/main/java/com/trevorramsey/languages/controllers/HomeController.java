package com.trevorramsey.languages.controllers;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trevorramsey.languages.models.Language;
import com.trevorramsey.languages.services.LanguageService;

@Controller
public class HomeController {
	private LanguageService lService;
	
	public HomeController(LanguageService service) {
		this.lService=service;
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.GET)
	public String index(Model Model,@ModelAttribute("error")String error){
		Model.addAttribute("language",this.lService.getAllLanguages());
		return "index.jsp";
	}
	@PostMapping("/languages")
	public String addLanguage(@RequestParam("name")String name,@RequestParam("creator") String creator,@RequestParam("version")Float version){		
		this.lService.createLanguage(name, creator, version);
		return "redirect:/languages";
	}	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.GET)
	public String getLanguage(@PathVariable("id") Long id, Model model) {
		Language language= this.lService.getSingleLanguage(id);
		model.addAttribute("language",language);
		return "view.jsp";
	}
	@RequestMapping(value="/{id}",method=RequestMethod.POST)
	public String delete(@PathVariable("id")Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/languages";
	}
	@RequestMapping("languages/{id}/edit")
	public String Edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", this.lService.getSingleLanguage(id));
		return "edit.jsp";
	}
	@RequestMapping(value="/{id}/edit", method=RequestMethod.POST)
	public String update(@PathVariable("id")Long id,@RequestParam("name")String name,@RequestParam("creator") String creator,@RequestParam("version")Float version) {      
		this.lService.updateLanguage(id,name, creator, version);
		return "redirect:/languages";
	}
}
