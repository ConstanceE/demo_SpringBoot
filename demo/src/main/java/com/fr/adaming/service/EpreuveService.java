package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IEpreuveDao;
import com.fr.adaming.entities.Epreuve;

@Service
public class EpreuveService implements IEpreuveService{
	
	@Autowired
	private IEpreuveDao epreuveDao; 

	@Override
	public Epreuve findOneById(Long id) {
		
		return epreuveDao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve e) {
		
		return epreuveDao.save(e);
	}

	@Override
	public void delete(Epreuve e) {
		epreuveDao.delete(e);
		
	}

	@Override
	public List<Epreuve> getAll() {
		
		return epreuveDao.findAll();
	}
	


}
