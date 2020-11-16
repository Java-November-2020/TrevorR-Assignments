package com.codingdojo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
	@RequestMapping("/dojo")
	public String dojo() {
		return "The Dojo is awesome!";
	}
	@RequestMapping("/dojo/{location}")
	public String variable(@PathVariable("location") String location) {
		switch(location) {
		case "burbank":
			return "Burbank dojo is located in Southern Cali.";
		case "san-jose":
			return "San-Jose dojo is the headquarters.";
		default: return location;
		}
	}
}