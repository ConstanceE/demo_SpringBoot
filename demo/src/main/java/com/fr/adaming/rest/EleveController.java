package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Eleve;

import com.fr.adaming.service.IEleveService;

@RestController
public class EleveController {
	
	@Autowired
	private IEleveService eleveService; 
	
	@GetMapping("/api/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return eleveService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Eleve save(@RequestBody Eleve e) {
		return eleveService.save(e);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Eleve e) {
		eleveService.delete(e);
	}

	@GetMapping("/api/getall")
	public List<Eleve> getAll() {
		return eleveService.getAll();
	}
	

}
