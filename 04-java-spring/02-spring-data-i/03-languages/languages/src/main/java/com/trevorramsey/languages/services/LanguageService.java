package com.trevorramsey.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trevorramsey.languages.models.Language;
import com.trevorramsey.languages.repositories.LanguageRepository;

@Service
public class LanguageService{
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo=repo;
	}
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	public Language getSingleLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Language createLanguage(String name, String creator, Float version) {
		Language newLanguage = new Language(name,creator,version);
		return this.lRepo.save(newLanguage);
	}
	public Language updateLanguage(Long id, String name, String creator, Float version) {
		Language updateLanguage = new Language(id,name,creator,version);
		return this.lRepo.save(updateLanguage);
	}
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}