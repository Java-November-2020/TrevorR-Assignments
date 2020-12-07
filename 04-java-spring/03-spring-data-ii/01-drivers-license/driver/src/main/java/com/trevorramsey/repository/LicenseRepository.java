package com.trevorramsey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trevorramsey.models.Driver;
import com.trevorramsey.models.License;

public interface LicenseRepository extends CrudRepository<License,Long>{
	List<License> findAll();
	License findTopByOrderByNumberDesc();

}
