package com.example.sampleshanker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleshanker.dto.Admin;
import com.example.sampleshanker.service.AdminService;

@RestController
@RequestMapping("/admins")
public class AdminController
{
 @Autowired
 AdminService adminService;
 
 @PostMapping
 public ResponseEntity<String> insert(@RequestBody Admin admin)
 {
	 return adminService.insert(admin);
 }
 @PostMapping("/many")
 public String insertAll(@RequestBody List<Admin> admins)
 {
	 return adminService.insertAll(admins);
 }
 
 @GetMapping("/{id}")
 public ResponseEntity<Admin> fetchById(@PathVariable int id)
 {
	 return adminService.fetchById(id);
 }
 
 @GetMapping
 public ResponseEntity<List<Admin>> fetchAll()
 {
	 return adminService.fetchAll();
	 
 }
 
 @GetMapping("email/{email}")
 public ResponseEntity<List<Admin>> findEmail(@PathVariable String email)
 {
	 return adminService.findEmail(email);
 }
 
 @PutMapping
 public ResponseEntity<String> updateAdmin(@RequestBody Admin admin){
	 
	 return adminService.updateAdmin(admin);
 }
 
 @DeleteMapping("/{id}")
 public ResponseEntity<String> deleteone(@PathVariable int id){
	 return adminService.deleteone(id);
 }
 
 @DeleteMapping
 public ResponseEntity<List<Admin>> deleteAdmin()
 {
	 return adminService.deleteAdmin();
 }
}
