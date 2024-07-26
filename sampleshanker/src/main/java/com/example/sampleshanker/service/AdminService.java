package com.example.sampleshanker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.sampleshanker.dto.Admin;
import com.example.sampleshanker.repository.AdminRepository;

@Component
public class AdminService 
{
	@Autowired
	AdminRepository repository;

	public ResponseEntity<String> insert(Admin admin)
	{
		repository.save(admin);
		return new ResponseEntity<String>("data Saved successfully",HttpStatus.CREATED);
	}

	public String insertAll(List<Admin> admins) 
	{
		 repository.saveAll(admins);
		  return "All Data saved success";

}

	public ResponseEntity<Admin> fetchById(int id)
	{
		
		Admin admin=repository.findById(id).orElse(null);
		if(admin==null)
		{
			return new ResponseEntity<Admin>(admin, HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<Admin>(admin,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<List<Admin>> fetchAll() {

		List<Admin> admins=repository.findAll();
		if(admins.isEmpty()) {
			return new ResponseEntity<List<Admin>>(admins,HttpStatus.NOT_FOUND);
		
		}else {
			return new ResponseEntity<List<Admin>>(admins,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<List<Admin>> findEmail(String email) {
		
		List<Admin> admins3=repository.findByEmail(email);
		
		if(admins3.isEmpty()) {
			return new ResponseEntity<List<Admin>>(admins3,HttpStatus.NOT_FOUND);
		
		}else {
			return new ResponseEntity<List<Admin>>(admins3,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<String> updateAdmin(Admin admin) {
		repository.save(admin);
		return new ResponseEntity<String>("data updated scuessfully", HttpStatus.CREATED);
	}

	public ResponseEntity<String> deleteone(int id) {
		
		Admin admin=repository.findById(id).orElse(null);
		if(admin==null) {
			return new ResponseEntity<String>("data not found", HttpStatus.NOT_FOUND);
		}else {
			repository.delete(admin);
			return new ResponseEntity<String>("data deleted successfully", HttpStatus.FOUND);
		}
	}

	public ResponseEntity<List<Admin>> deleteAdmin() 
	{
		
	List<Admin> admins=repository.findAll();
	if(admins.isEmpty())
	{
		return new ResponseEntity<List<Admin>>(admins, HttpStatus.NOT_FOUND);
	}else {
		repository.deleteAll(admins);
		return new ResponseEntity<List<Admin>>(admins, HttpStatus.FOUND);
	}
	}
	
}
