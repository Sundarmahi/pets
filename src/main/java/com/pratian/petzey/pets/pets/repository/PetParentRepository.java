package com.pratian.petzey.pets.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratian.petzey.pets.pets.entites.PetParent;

@Repository
public interface PetParentRepository extends JpaRepository<PetParent, Long>{

}
