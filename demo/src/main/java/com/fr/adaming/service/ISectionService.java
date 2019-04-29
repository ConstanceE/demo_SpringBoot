package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Section;

public interface ISectionService {
	
	Section findOneById(Long id); 
	Section save(Section s); 
	void delete(Section s); 
	List<Section> getAll(); 

}
