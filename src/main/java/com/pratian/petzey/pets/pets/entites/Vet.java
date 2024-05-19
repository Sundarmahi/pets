package com.pratian.petzey.pets.pets.entites;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vet {
	private  long vetId;
	private  long vetName;
	private  long mobileNo;
	private  long email;
	private  long speciality;
	
    
}
