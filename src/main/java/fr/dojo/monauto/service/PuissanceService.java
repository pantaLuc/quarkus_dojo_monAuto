package fr.dojo.monauto.service;

import fr.dojo.monauto.data.entity.Puissance;
import fr.dojo.monauto.data.repository.PuissanceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

import javax.management.InstanceAlreadyExistsException;
import java.util.List;

@ApplicationScoped
public class PuissanceService {
    @Inject
    PuissanceRepository puissanceRepository ;

    public List<Puissance> puissanceList(){
        return this.puissanceRepository.listAll() ;
    }

    public Puissance addPuissance(Puissance puissance) throws InstanceAlreadyExistsException {
        if(puissanceRepository.findByPuissance(puissance.getPuissance())!=null){
          throw new NotFoundException("La puissance existe deja");
        }
        puissanceRepository.persist(puissance);
        return puissance ;
    }

    public Puissance deletePuissance(long id){
        Puissance puissance =puissanceRepository.findById(id);
        if(puissance==null){
            throw new NotFoundException("La puissance n' existe pas") ;
        }
        this.puissanceRepository.deleteById(id);
        return puissance ;
    }

    public Puissance getById(long id){
        Puissance puissance=puissanceRepository.findById(id);
        if(puissance==null){
            throw new NotFoundException("La puissance n'existe pas");
        }
        return puissance ;
    }


}
