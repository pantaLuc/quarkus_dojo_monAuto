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
    //TODO : Ecrire le service pour rechercher par le numero de Serie

    public Vehicule  getByNumeroSerie(String serie){
        Vehicule vehicule = vehiculeRepository.findBySerie(serie) ;
        if (vehicule==null){
            throw new NotFoundException();
        }
        return vehicule ;
    }
    public void deleteVehicule(long idVehicule){
        Vehicule vehicule=vehiculeRepository.findById(idVehicule);
        if (vehicule==null) {
            throw new NotFoundException();
        }
        vehiculeRepository.delete(vehicule);
    }

    @Transactional
    public Vehicule updateVehicule(Long vehiculeId, Vehicule updatedVehicule) {
        Vehicule existingVehicule = this.vehiculeRepository.findById(vehiculeId);
        if (existingVehicule == null) {
            throw new NotFoundException("Vehicule not found with ID: " + vehiculeId);
        }

        // Update the properties of the existing vehicule with the new values
        existingVehicule.setEnergie(updatedVehicule.getEnergie());
        existingVehicule.setNbPLACECAB(updatedVehicule.getNbPLACECAB());
        existingVehicule.setNbPlaceHCAB(updatedVehicule.getNbPlaceHCAB());
        existingVehicule.setMarque(updatedVehicule.getMarque());
        existingVehicule.setType(updatedVehicule.getType());
        existingVehicule.setSerie(updatedVehicule.getSerie());
        this.vehiculeRepository.persist(existingVehicule);
        return existingVehicule;
    }
}
