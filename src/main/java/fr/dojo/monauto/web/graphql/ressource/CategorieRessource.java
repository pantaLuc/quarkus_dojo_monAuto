package fr.dojo.monauto.web.graphql.ressource;


import fr.dojo.monauto.data.entity.Categorie;
import fr.dojo.monauto.service.CategorieService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class CategorieRessource {
    private  final CategorieService categorieService ;

    public CategorieRessource(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @Query
    @Description("List of all vehicules'categories")
    public List<Categorie> allCategorie(){
        return this.categorieService.categorieList();
    }
}
