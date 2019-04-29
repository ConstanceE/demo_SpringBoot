package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.ILaboratoireDao;
import com.fr.adaming.entities.Laboratoire;

@Service
public class LaboratoireService implements ILaboratoireService{
	
	@Autowired
	private ILaboratoireDao laboDao; 

	@Override
	public Laboratoire findOneById(Long id) {
		
		return laboDao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire l) {
		
		return laboDao.save(l);
	}

	@Override
	public void delete(Laboratoire l) {
		laboDao.delete(l);
		
	}

	@Override
	public List<Laboratoire> getAll() {
		
		return laboDao.findAll();
	}

}
