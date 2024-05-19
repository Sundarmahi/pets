package com.pratian.petzey.pets.pets.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.pratian.petzey.pets.pets.entites.Pet;
import com.pratian.petzey.pets.pets.repository.PetRepository;
import com.pratian.petzey.pets.pets.service.PetzeyService;


public class PetServiceImplmentationTest {
	
    @Mock
    private PetRepository repo;
    @Autowired
    private PetzeyService p;
    AutoCloseable close;
    Pet pet;
    
	@BeforeEach
    void setUp() {	
		close=MockitoAnnotations.openMocks(this);
		pet=new Pet();
	}
	
	@Test
	void savepet() {
		mock(Pet.class);
		mock(repo.getClass());
		
		when(repo.save(pet)).thenReturn(pet);
		assertThat(p.savePet(0, pet)).isEqualTo(pet);
	}
	
	//get by id
	@Test
	void getbyIdtest() {
		mock(Pet.class);
		mock(repo.getClass());
		
		when(repo.findById(1l)).thenReturn(Optional.ofNullable(pet));
		assertThat(p.getPetById(1).getPetName())
		.isEqualTo(pet.getPetName());
	}
	
	
	
	@AfterEach
	void tearDown() throws Exception {
		close.close();
	}

}
