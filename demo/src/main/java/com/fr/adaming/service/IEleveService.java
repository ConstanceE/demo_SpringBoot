package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Eleve;

public interface IEleveService {
	
	Eleve findOneById(Long id); 
	Eleve save(Eleve e); 
	void delete(Eleve e); 
	List<Eleve> getAll(); 

}
