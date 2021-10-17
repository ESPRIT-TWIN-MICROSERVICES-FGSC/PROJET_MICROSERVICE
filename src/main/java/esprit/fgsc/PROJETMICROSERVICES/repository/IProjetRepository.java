package esprit.fgsc.PROJETMICROSERVICES.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import esprit.fgsc.PROJETMICROSERVICES.entities.Projet;

@Repository
public interface IProjetRepository extends MongoRepository<Projet, String>{

}
