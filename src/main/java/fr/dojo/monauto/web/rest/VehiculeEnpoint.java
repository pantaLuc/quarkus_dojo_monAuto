package fr.dojo.monauto.web.rest;


import fr.dojo.monauto.data.entity.Vehicule;
import fr.dojo.monauto.service.VehiculeService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

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

    @POST
    @Transactional
    @ResponseStatus(201)
    public Vehicule addVehicule( Vehicule vehicule){
        this.vehiculeService.createVehicule(vehicule);
        return vehicule ;
    }
    @GET
    @Path("/{serie}")
    public Vehicule getVehicule(@RestPath("serie") String serie){
        return  this.vehiculeService.getByNumeroSerie(serie);
    }

    @PATCH
    @Path("/{vehiculeId}")
    public Vehicule updateVehicule(@RestPath("vehiculeId") Long vehiculeId,  Vehicule updatedVehicule) {
        Vehicule updatedVehicule1 = vehiculeService.updateVehicule(vehiculeId, updatedVehicule);
        return this.vehiculeService.updateVehicule(vehiculeId ,updatedVehicule1);
    }
}
