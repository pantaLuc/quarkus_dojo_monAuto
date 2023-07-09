package fr.dojo.monauto.web.rest;


import fr.dojo.monauto.data.entity.Categorie;
import fr.dojo.monauto.service.CategorieService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.List;

@Produces("application/json")
@Consumes("application/json")
@Path("/rest/categories")
public class CategorieEnpoint {

    @Inject
    CategorieService categorieService ;

    @GET()
    public List<Categorie> getall(){
        return this.categorieService.categorieList();
    }

    @POST()
    @Transactional
    @ResponseStatus(201)
    public Categorie addCategorie(Categorie categorie){
        return this.categorieService.addCategorie(categorie) ;
    }

    @GET()
    @Path("/{idCategorie}")
    public Categorie getById(@RestQuery("categorieId") long id){
        return this.categorieService.findById(id);
    }


}
