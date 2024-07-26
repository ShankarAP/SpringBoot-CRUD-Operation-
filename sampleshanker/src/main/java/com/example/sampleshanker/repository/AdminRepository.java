package com.example.sampleshanker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sampleshanker.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{

	List<Admin> findByEmail(String email);

	List<Admin> findByEmailAndName(String email, String name);

}
