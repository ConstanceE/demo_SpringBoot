package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Laboratoire;
import com.fr.adaming.service.ILaboratoireService;

@RestController
public class LaboratoireController {
	
	@Autowired
	private ILaboratoireService laboService; 
	
	@GetMapping("/api/get/{id}")
	public Laboratoire findOneById(@PathVariable Long id) {
		return laboService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Laboratoire save(@RequestBody Laboratoire l) {
		return laboService.save(l);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Laboratoire l) {
		laboService.delete(l);
	}

	@GetMapping("/api/getall")
	public List<Laboratoire> getAll() {
		return laboService.getAll();
	}
	
	

}
