package com.trevorramsey.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trevorramsey.models.Driver;
import com.trevorramsey.models.License;
import com.trevorramsey.repository.DriverRepository;
import com.trevorramsey.repository.LicenseRepository;

@Service
public class DriverService {
	private DriverRepository dRepo;
	private LicenseRepository lRepo;
	
	public DriverService(DriverRepository dRepo,LicenseRepository lRepo) {
		this.dRepo = dRepo;
		this.lRepo = lRepo;
	}
	public List<Driver> getDriverInfo() {
		return this.dRepo.findAll();
	}
	public List<License> getLicenseInfo(){
		return this.lRepo.findAll();
	}
	public Driver getDriverById(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	public List<Driver> getDriverNoLicense(){
		return this.dRepo.findByLicenseIdIsNull();
	}
	public Driver createDrive(Driver driver) {
		return this.dRepo.save(driver);
	}
	public License createLicense(License license) {
		return this.lRepo.save(license);
	}
}
