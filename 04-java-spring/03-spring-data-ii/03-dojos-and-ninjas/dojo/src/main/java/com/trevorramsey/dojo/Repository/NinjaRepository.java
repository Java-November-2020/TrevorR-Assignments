package com.trevorramsey.dojo.Repository;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;

import com.trevorramsey.dojo.Models.Ninja;



public interface NinjaRepository extends CrudRepository<Ninja,Long> {
	List<Ninja> findAll();
}
