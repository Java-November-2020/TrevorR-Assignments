package com.codingdojo.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.repositories.LookifyRepository;

@Service
public class LookifyServices {
	private LookifyRepository lRepo;
	
	public LookifyServices(LookifyRepository repo) {
		this.lRepo=repo;
	}
	public List<Lookify> getAllSongs(){
		return this.lRepo.findAll();
	}
	public List<Lookify> getSingleSong(String artist) {
		return  this.lRepo.findByArtistContaining(artist);
	}
	public List<Lookify> topTenByRating() {
		return  this.lRepo.findTop10ByOrderByRatingDesc();
	}
	public Lookify getSongById(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Lookify createSong(Lookify lookify) {
		
		return this.lRepo.save(lookify);
	}
	public Lookify updateSong(Long id, String title, String artist, int rating) {
		Lookify updateLookify = new Lookify(id,title,artist,rating);
		return this.lRepo.save(updateLookify);
	}
	public void deleteSong(Long id) {
		this.lRepo.deleteById(id);
	}
}

