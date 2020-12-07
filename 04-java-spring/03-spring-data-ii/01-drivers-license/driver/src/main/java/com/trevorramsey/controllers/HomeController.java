package com.trevorramsey.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trevorramsey.models.Driver;
import com.trevorramsey.models.License;
import com.trevorramsey.services.DriverService;

@Controller
public class HomeController {
	private DriverService dService;
	public HomeController(DriverService service) {
		this.dService = service;
	}
	@RequestMapping("/driver/new")
		public String newDriver(@ModelAttribute("driver") Driver driver) {
			return "newDriver.jsp";
	}
	@PostMapping("/driver")
		public String driver(@ModelAttribute("driver") Driver driver) {
			dService.createDrive(driver);
			return "redirect:/license/new";
		
	}
	@RequestMapping("/license/new")
		public String newLicense(@ModelAttribute("license") License license, Model model) {
			List<Driver> noLicense = this.dService.getDriverNoLicense();
			model.addAttribute("drivers", noLicense);
			return "newLicense.jsp";
	}
	@PostMapping("/license")
		public String license(@ModelAttribute("license") License license) {
			dService.createLicense(license);
			return "redirect:/driver/new";
	}
	@RequestMapping("/driver/{id}")
		public String showInfo(@PathVariable("id")Long id, Model model) {
		model.addAttribute("driver", dService.getDriverById(id));
		return "show.jsp";
	}
		
	

}
