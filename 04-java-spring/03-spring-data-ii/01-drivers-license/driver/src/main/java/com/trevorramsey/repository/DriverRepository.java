package com.trevorramsey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.trevorramsey.models.Driver;


public interface DriverRepository extends CrudRepository<Driver,Long> {
	List<Driver> findAll();
	List<Driver> findByLicenseIdIsNull();

}
