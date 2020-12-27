package com.trevorramsey.belt.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.trevorramsey.belt.models.User;
import com.trevorramsey.belt.repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(!user.getPassword().equals(user.getConPassword())) {
			errors.rejectValue("password", "Match","Passwords Do Not Match!");
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email","unique","Email has already been used");
		}
	}

}
