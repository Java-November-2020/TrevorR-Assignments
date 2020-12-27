package com.trevorramsey.belt.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.trevorramsey.belt.models.Event;
import com.trevorramsey.belt.models.State;
import com.trevorramsey.belt.models.User;
import com.trevorramsey.belt.services.EventService;
import com.trevorramsey.belt.services.UserService;

@Controller
public class EventController {
	@Autowired
	private EventService eService;
	@Autowired
	private UserService uService;
	
	@GetMapping("/dashboard")
	public String dashboard( @ModelAttribute("event")Event event, Model model, HttpSession session){
		Long userId = (Long)session.getAttribute("user_id");
		User user = this.uService.getOneUser(userId);
		model.addAttribute("user",this.uService.getOneUser(userId));
		model.addAttribute("usersStates", this.eService.allEventsWithState(user.getState()));
		model.addAttribute("otherStates", this.eService.allEventsNotState(user.getState()));
		model.addAttribute("events",this.eService.getEvent());
		model.addAttribute("states",State.States);
		return"dashboard.jsp";
	}
	@PostMapping("/newevent")
	public String newEvent(@Valid @ModelAttribute("event")Event event,BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}
		Long userId = (Long)session.getAttribute("user_id");
		User userEvent = this.uService.getOneUser(userId);
		event.setPlanner(userEvent);
		this.eService.createEvent(event);
		return"redirect:/dashboard";
	}
	@GetMapping("/delete/{id}")
	public String deleteEvent(@PathVariable("id")Long id) {
		this.eService.deleteEvent(id);
		return "redirect:/dashboard";
	}
	@GetMapping("/event/{id}")
	public String viewEvent(@PathVariable("id")Long id,Model model) {
		model.addAttribute("event",this.eService.getOneEvent(id));
		return "show.jsp";
	}
	@GetMapping("/join/{id}")
	public String joinEvent(@PathVariable("id")Long id,HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		Event goEvent = this.eService.getOneEvent(id);
		User userAttending = this.uService.getOneUser(userId);
		this.eService.addAttendee(goEvent, userAttending);
		return "redirect:/dashboard";
	}
	@GetMapping("/cancel/{id}")
	public String cancelEvent(@PathVariable("id")Long id,HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		Event goEvent = this.eService.getOneEvent(id);
		User userAttending = this.uService.getOneUser(userId);
		this.eService.removeAttendee(goEvent, userAttending);
		return "redirect:/dashboard";
	}

}
