package com.codingdojo.datetime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class HomeController {
	
	@RequestMapping("/")
		public String index() {
		return "index.jsp";
	}

	@RequestMapping("/{dateTime}")
		public String dateTime(@PathVariable("dateTime") String dateTime, Model model) {
		switch(dateTime) {
			case "date":
				SimpleDateFormat date= new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");	
			model.addAttribute("dateFormat", date.format(new java.util.Date()));
				return "date.jsp";
			case "time":
				SimpleDateFormat time= new SimpleDateFormat("h:mm a");
				model.addAttribute("timeFormat", time.format(new java.util.Date()));
				return "time.jsp";
			default:
				return dateTime;		
				}
		
	}

	
}
