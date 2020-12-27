package com.trevorramsey.belt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trevorramsey.belt.models.Event;
import com.trevorramsey.belt.models.User;
import com.trevorramsey.belt.repositories.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eRepo;

	public List<Event> getEvent(){
		return this.eRepo.findAll();
	}
	public Event getOneEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	public Event createEvent(Event event) {
		return this.eRepo.save(event);
	}
	public Event editEvent(Event event) {
		return this.eRepo.save(event);
	}
	public void deleteEvent(Long id) {
		this.eRepo.deleteById(id);
	}
	public List<Event> allEventsWithState(String state) {
		return this.eRepo.findByState(state);
	}
	public List<Event> allEventsNotState(String state) {
		return this.eRepo.findByStateIsNot(state);
	}
	public void addAttendee(Event event, User user) {
		List<User> currAttendees = event.getAttendee();
		currAttendees.add(user);
		this.editEvent(event);
	}
	public void removeAttendee(Event event, User user) {
		List<User> currAttendees = event.getAttendee();
		currAttendees.remove(user);
		this.editEvent(event);
	}
}
