package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Section;
import com.fr.adaming.service.ISectionService;

@RestController
public class SectionController {
	
	@Autowired
	private ISectionService sectionService; 
	
	@GetMapping("/api/get/{id}")
	public Section findOneById(@PathVariable Long id) {
		return sectionService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Section save(@RequestBody Section s) {
		return sectionService.save(s);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Section s) {
		sectionService.delete(s);
	}

	@GetMapping("/api/getall")
	public List<Section> getAll() {
		return sectionService.getAll();
	}
	

}
