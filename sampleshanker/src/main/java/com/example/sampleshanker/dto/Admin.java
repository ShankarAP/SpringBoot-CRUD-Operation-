package com.example.sampleshanker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin 
{
 @Id
 private int id;
 private String name;
 private String email;
}
