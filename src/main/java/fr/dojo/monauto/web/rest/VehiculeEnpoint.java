package fr.dojo.monauto.web.rest;


import fr.dojo.monauto.data.entity.Vehicule;
import fr.dojo.monauto.service.VehiculeService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;


@Path("/rest/vehicules")
@Produces("application/json")
@Consumes("application/json")
public class VehiculeEnpoint {
    private final VehiculeService vehiculeService ;

    public VehiculeEnpoint(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @GET
    public List<Vehicule> getAllVehicules(){
        return this.vehiculeService.getAll() ;
    }
}
