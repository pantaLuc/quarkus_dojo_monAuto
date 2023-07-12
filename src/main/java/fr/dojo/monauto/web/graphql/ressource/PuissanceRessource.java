package fr.dojo.monauto.web.graphql.ressource;

import fr.dojo.monauto.data.entity.Puissance;
import fr.dojo.monauto.service.PuissanceService;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class PuissanceRessource {

   private final PuissanceService puissanceService ;

    public PuissanceRessource(PuissanceService puissanceService) {
        this.puissanceService = puissanceService;
    }

    @Query
    @Description("Liste des puissances des vehicules ")
    public List<Puissance> getAllPuissance(){return this.puissanceService.puissanceList();}
}
