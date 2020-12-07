package com.trevorramsey.dojo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trevorramsey.dojo.Models.Dojo;
import com.trevorramsey.dojo.Models.Ninja;
import com.trevorramsey.dojo.Repository.DojoRepository;
import com.trevorramsey.dojo.Repository.NinjaRepository;
@Service
public class DNService {
	private DojoRepository dRepo;
	private NinjaRepository nRepo;
	
	public DNService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dRepo = dRepo;
		this.nRepo = nRepo;
	}
	
	public List<Dojo> getAllDojo(){
		return this.dRepo.findAll();
	}
	public List<Ninja> getAllNinja(){
		return this.nRepo.findAll();
	}
	public Dojo getDojoById(Long id) {
		return this.dRepo.findById(id).orElse(null);		
	}
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
