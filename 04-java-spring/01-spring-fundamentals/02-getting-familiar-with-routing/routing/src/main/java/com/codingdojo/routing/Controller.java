package com.codingdojo.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping ("/coding")
	public String coding(){
		return "Hello Coding Dojo";
	}
	@RequestMapping ("/coding/python")
	public String python() {
		return "Ive never done Python!";
	}
	@RequestMapping ("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}
