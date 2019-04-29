package com.fr.adaming.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Eleve;

@Repository
public interface IEleveDao extends JpaRepository<Eleve, Long> {
	
	List<Eleve> findByNom(String nom);
	List<Eleve> findByPrenom(String prenom); 
	

}
