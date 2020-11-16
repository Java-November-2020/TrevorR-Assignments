package com.codingdojo.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	   @RequestMapping("/")
	    public String index(@ModelAttribute("error")String error){
	        return "index.jsp";
	    }
	
	    @RequestMapping("/errors")
	    public String error(RedirectAttributes redirectAttributes){
	        redirectAttributes.addFlashAttribute("error", "You must train harder!!");
	        return "redirect:/";
	    }

    @RequestMapping(path="/login", method=RequestMethod.POST)
    public String home(@RequestParam (value="code") String code) {
    	if(code.equals("bushido")) {
    		return "redirect:/code";
    	}
    	else {
    		return "redirect:/errors";
    		
    	}
    }
    @RequestMapping("/code")
    public String code(){
    	return "code.jsp";
    }

}
