package fr.dojo.monauto.data.repository;


/*adding Scoped to Inject Bean*/

import fr.dojo.monauto.data.entity.Vehicule;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehiculeRepository implements PanacheRepository<Vehicule> {


    public Vehicule findByMarque(String Marque){
        return  find("marque" ,Marque).firstResult();
    }

    public Vehicule findBySerie(String serie){
        return find("serie" ,serie).firstResult();
    }

}
