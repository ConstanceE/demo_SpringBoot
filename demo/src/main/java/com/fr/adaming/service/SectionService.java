package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.ISectionDao;
import com.fr.adaming.entities.Section;

@Service
public class SectionService implements ISectionService{
	
	@Autowired
	private ISectionDao sectionDao; 

	@Override
	public Section findOneById(Long id) {
		
		return sectionDao.getOne(id);
	}

	@Override
	public Section save(Section s) {
		
		return sectionDao.save(s);
	}

	@Override
	public void delete(Section s) {
		sectionDao.delete(s);
		
	}

	@Override
	public List<Section> getAll() {
		
		return sectionDao.findAll();
	}

}
