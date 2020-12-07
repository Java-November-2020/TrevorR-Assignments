package com.codingdojo.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.services.LookifyServices;

@Controller
public class HomeController {
	private LookifyServices lService;
	public HomeController(LookifyServices service) {
		this.lService = service;
	}
	@RequestMapping("/")
	public String index(){
		return "index.jsp";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("song",lService.getAllSongs());
		return "dashboard.jsp";
	}
    @RequestMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Lookify lookify) {
        return "new.jsp";
    }
    @PostMapping("/songs")
    public String createSong(@Valid @ModelAttribute("song") Lookify lookify, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "new.jsp";
        }else{
        	lService.createSong(lookify);
            return "redirect:/dashboard";
        }
    }
    @RequestMapping("/songs/search")
    public String searchSong(@RequestParam("artist") String artist,Model model) {
    	model.addAttribute("song",lService.getSingleSong(artist));
    	model.addAttribute("artist",artist);
    	return "search.jsp";
    }
    @RequestMapping("/songs/{id}")
    public String singleSong(@PathVariable("id") Long id,Model model) {
    	model.addAttribute("song", lService.getSongById(id));
    	return "song.jsp";
    }
    @RequestMapping("/delete/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
    	this.lService.deleteSong(id);
    	return "redirect:/dashboard";
    }
    @RequestMapping("/search/topten")
    public String topTen(Model model) {
    	model.addAttribute("song", lService.topTenByRating());
    	return "topten.jsp";
    }
}
