package esprit.fgsc.PROJETMICROSERVICES.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import esprit.fgsc.PROJETMICROSERVICES.entities.Projet;
import esprit.fgsc.PROJETMICROSERVICES.services.ProjetService;





@CrossOrigin(origins = "*")
@RestController
public class ProjetController {
	@Autowired
	private  ProjetService projetService;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Projet> createProjet(@RequestBody Projet projet) {
		return new ResponseEntity<>(projetService.addProjet(projet), HttpStatus.OK);
	}
	
	@GetMapping("/projets")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Projet> >getAllProjet(){
		 return new ResponseEntity<>(projetService.getAllProjet(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProjet(@PathVariable String id) {
	    return projetService.deleteProjet(id.toString());
	}

	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Projet> updateProjet(@PathVariable("id") String id,@Valid @RequestBody Projet projet) {
		return new ResponseEntity<>(projetService.updateProjet(id, projet),HttpStatus.OK);
	}
	

}
