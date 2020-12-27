package com.trevorramsey.belt.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trevorramsey.belt.models.Event;
import com.trevorramsey.belt.models.State;
import com.trevorramsey.belt.models.User;
import com.trevorramsey.belt.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}

}
