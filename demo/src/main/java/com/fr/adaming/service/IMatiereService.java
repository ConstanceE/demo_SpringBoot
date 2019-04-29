package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Matiere;

public interface IMatiereService {
	
	Matiere findOneById(Long id); 
	Matiere save(Matiere m); 
	void delete(Matiere m); 
	List<Matiere> getAll(); 

}
