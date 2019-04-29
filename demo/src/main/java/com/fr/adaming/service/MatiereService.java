package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IMatiereDao;
import com.fr.adaming.entities.Matiere;

@Service
public class MatiereService implements IMatiereService{
	
	@Autowired
	private IMatiereDao matDao;  

	@Override
	public Matiere findOneById(Long id) {	
		return matDao.getOne(id); 
		
	}

	@Override
	public Matiere save(Matiere m) {
		
		return matDao.save(m);
	}

	@Override
	public void delete(Matiere m) {
		matDao.delete(m); 
		
	}

	@Override
	public List<Matiere> getAll() {
		
		return matDao.findAll();
	}

}
