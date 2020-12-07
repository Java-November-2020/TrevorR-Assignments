package com.trevorramsey.dojo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trevorramsey.dojo.Models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo,Long>{
	List<Dojo> findAll();
}
