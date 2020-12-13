package com.trevorramsey.overflow.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trevorramsey.overflow.Models.Answer;
import com.trevorramsey.overflow.Models.NewQuestion;
import com.trevorramsey.overflow.Models.Question;
import com.trevorramsey.overflow.Models.Tag;
import com.trevorramsey.overflow.Services.OverflowService;

@Controller
public class HomeController {
	private OverflowService oService;
	public HomeController(OverflowService oService) {
		this.oService = oService;
	}
	@RequestMapping("/")
		public String index() {
		return "redirect:/questions";
	}
	@GetMapping("/questions")
		public String questions(Model model) {
		model.addAttribute("questions",this.oService.findQuestions());
		return "dashboard.jsp";
	}
	@RequestMapping("/questions/new")
		public String newQuestion(@ModelAttribute("newQuestion")Question question, @ModelAttribute("tag")Tag tag) {
		return "newQuestion.jsp";
	}
	@PostMapping("/question")
		public String createQuestion(@Valid @ModelAttribute("newQuestion")NewQuestion newQuestion, BindingResult result) {
		if(result.hasErrors()) {
			return"newQuestion.jsp";
		}
		this.oService.createNewQuestion(newQuestion);
		return "redirect:/questions";
	}
	@GetMapping("/questions/{id}")
		public String showQuestion(@PathVariable("id")Long id, Model model, @ModelAttribute("a")Answer answer) {
		model.addAttribute("answers",this.oService.findAnswers());
		model.addAttribute("tags", this.oService.findTag());
		model.addAttribute("question", this.oService.findQuestion(id));
		return "newAnswer.jsp";
	}
	@PostMapping("/answer")
		public String addAnswer(@Valid @ModelAttribute("a")Answer answer,BindingResult result) {
		if(result.hasErrors()) {
			return "newAnswer.jsp";
		}
		this.oService.createAnswer(answer);
		return "redirect:/questions";
	}
	

}
