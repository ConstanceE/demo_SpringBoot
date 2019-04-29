package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Epreuve;
import com.fr.adaming.service.IEpreuveService;

@RestController
public class EpreuveController {
	
	@Autowired
	private IEpreuveService epreuveService; 
	
	@GetMapping("/api/get/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		return epreuveService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Epreuve save(@RequestBody Epreuve e) {
		return epreuveService.save(e);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Epreuve e) {
		epreuveService.delete(e);
	}

	@GetMapping("/api/getall")
	public List<Epreuve> getAll() {
		return epreuveService.getAll();
	}
	
	
 

}
