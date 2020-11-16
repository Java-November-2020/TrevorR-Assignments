package com.codingdojo.survey;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.survey.model.Survey;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path="/result" , method=RequestMethod.POST)
	public String info(@RequestParam(value="name")String name,@RequestParam(value="location")String location, @RequestParam(value="language")String language,@RequestParam(value="comments")String comments, Model model) {
		model.addAttribute("model",new Survey(name,location,language,comments));
		return "results.jsp";
	}
//	@RequestMapping("/results")
//	public String results() {
//		return"results.jsp";
//}
}
