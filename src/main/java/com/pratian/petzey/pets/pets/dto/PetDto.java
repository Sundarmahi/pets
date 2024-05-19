package com.pratian.petzey.pets.pets.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDto {
	private Long pet_id;

	private String pet_name;
	private String breed;
	private String gender;
	private Integer age;
	private String bloodGroup;
	private Date dateOfBirth;
	
}