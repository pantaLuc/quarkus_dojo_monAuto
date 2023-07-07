package fr.dojo.monauto.web.graphql.ressource;

import fr.dojo.monauto.data.entity.Vehicule;
import fr.dojo.monauto.service.VehiculeService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class VehiculeRessource {
    private  final VehiculeService vehiculeService ;


    public VehiculeRessource(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @Query("allVehicules")
    @Description("Get all Vehicules available in the system ")
    public List<Vehicule> getAllVehicule(){
       return  this.vehiculeService.getAll() ;
    }
}
