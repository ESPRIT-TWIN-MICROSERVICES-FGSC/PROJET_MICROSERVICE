package esprit.fgsc.PROJETMICROSERVICES.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.fgsc.PROJETMICROSERVICES.entities.Projet;
import esprit.fgsc.PROJETMICROSERVICES.repository.IProjetRepository;


@Service
public class ProjetService {
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	@Autowired
	private IProjetRepository projetRepository;
	
	public Projet addProjet(Projet projet) {
		return projetRepository.save(projet);
		
	}
	public List<Projet>getAllProjet(){
		 return projetRepository.findAll();
	}
	
	public void deleteProjet(String id) {   
		projetRepository.deleteById(id);
	}
          
public Projet updateProjet(String id,Projet newProjet) {
	if(projetRepository.findById(id).isPresent()) {
		Projet existingProjet = projetRepository.findById(id).get();
		existingProjet.setClientEmail(newProjet.getClientEmail());
		existingProjet.setClientName(newProjet.getClientName());
		existingProjet.setProjectName(newProjet.getProjectName());
		existingProjet.setTeamSize(newProjet.getTeamSize());
		existingProjet.setStartDate( newProjet.getStartDate());
		existingProjet.setEndDate(newProjet.getEndDate());
		return projetRepository.save(existingProjet);
		
	}else {
		return null;
	}
}

public Projet getProjetById(String id) {
	return projetRepository.findById(id).get();
	
}

}
