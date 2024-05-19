package com.pratian.petzey.pets.pets.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.pratian.petzey.pets.pets.entites.Pet;
//import com.pratian.petzey.pets.pets.entites.PetParent;
//import com.pratian.petzey.pets.pets.enums.PetGender;
//import com.pratian.petzey.pets.pets.enums.Species;

@DataJpaTest
public class PetRepositoryTest {
//
//   @Autowired
//   private PetRepository petRepository;
//   Pet pet;
//
//   @BeforeEach
//   void setUp() {
//
//	   pet=new Pet(1l, "lulu", Species.Dog, PetGender.male, 12, "b+ve", null, "skin", "caugh", null);
//	   petRepository.save(pet);
//   }
//
//   @AfterEach
//   void tearDown() {
//	   pet=null;
//	   petRepository.deleteAll();
//   }
//
//   //testcase success
//   @Test
//   void testFindByName() {
//	  Pet p= petRepository.findByName("lulu");
//	  assertThat(p.getPetId()).isEqualTo(pet.getPetId());
//	  assertThat(p.getBreed()).isEqualTo(pet.getBreed());
//   }
//

}
