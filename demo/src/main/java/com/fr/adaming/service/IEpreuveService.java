package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Epreuve;

public interface IEpreuveService {
	
	Epreuve findOneById(Long id); 
	Epreuve save(Epreuve e); 
	void delete(Epreuve e); 
	List<Epreuve> getAll(); 
	

}
