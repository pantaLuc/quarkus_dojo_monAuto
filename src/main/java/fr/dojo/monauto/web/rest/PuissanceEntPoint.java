package fr.dojo.monauto.web.rest;

import fr.dojo.monauto.data.entity.Puissance;
import fr.dojo.monauto.service.PuissanceService;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import javax.management.InstanceAlreadyExistsException;
import java.util.List;

@Produces("application/json")
@Consumes("application/json")
@Path("/rest/puissances")
public class PuissanceEntPoint {
    @Inject
    PuissanceService puissanceService;

    @GET()
    public List<Puissance> getAll(){
        return this.puissanceService.puissanceList();
    }
    @POST()
    @Transactional
    @ResponseStatus(201)
    public Puissance addPuissance(Puissance puissance) throws InstanceAlreadyExistsException {
        return puissanceService.addPuissance(puissance);
    }

    @DELETE()
    @Transactional
    public Puissance deletePuissance(@RestQuery("id") long id ){
        return this.puissanceService.deletePuissance(id);
    }

    @GET()
    @Path("/{idPuissance}")
    public Puissance getById(@RestPath("id") long id){
        return this.puissanceService.getById(id);
    }


}
