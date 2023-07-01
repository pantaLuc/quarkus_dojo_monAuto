package fr.dojo.monauto.service;


import fr.dojo.monauto.data.entity.Vehicule;
import fr.dojo.monauto.data.repository.VehiculeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class VehiculeService {

    private final VehiculeRepository vehiculeRepository ;


    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    public List<Vehicule> getAll(){return this.vehiculeRepository.listAll() ;}

    @Transactional
    public Vehicule createVehicule(Vehicule vehicule){
       this.vehiculeRepository.persist(vehicule);
       return  vehicule ;
    } ;

    public Vehicule getVehicule(long idVehicule){
        Vehicule vehicule=vehiculeRepository.findById(idVehicule);
        if (vehicule==null) {
            throw new NotFoundException();
        }
        return vehicule ;
    }

    // TODO : Ecrire le service pour faire une recherche par Marque

    // TODO : Ecrire le service pour faire une recherche par Marque et nombre de place à Bord
    public void deleteVehicule(long idVehicule){
        Vehicule vehicule=vehiculeRepository.findById(idVehicule);
        if (vehicule==null) {
            throw new NotFoundException();
        }
        vehiculeRepository.delete(vehicule);
    }


}
