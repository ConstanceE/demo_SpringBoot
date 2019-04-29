package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Matiere;
import com.fr.adaming.service.IMatiereService;

@RestController
public class MatiereController {
	
	@Autowired
	private IMatiereService matiereService; 
	
	@GetMapping("/api/get/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		return matiereService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Matiere save(@RequestBody Matiere m) {
		return matiereService.save(m);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Matiere m) {
		matiereService.delete(m);
	}

	@GetMapping("/api/getall")
	public List<Matiere> getAll() {
		return matiereService.getAll();
	}


}
