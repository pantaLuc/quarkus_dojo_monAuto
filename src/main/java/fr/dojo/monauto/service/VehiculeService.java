package fr.dojo.monauto.service;


import fr.dojo.monauto.data.entity.Vehicule;
import fr.dojo.monauto.data.repository.VehiculeRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class VehiculeService {

    private final VehiculeRepository vehiculeRepository ;


    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    public List<Vehicule> getAll(){return this.vehiculeRepository.listAll() ;}
}
