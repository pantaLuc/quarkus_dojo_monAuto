package fr.dojo.monauto.web.graphql.input;

import fr.dojo.monauto.data.entity.Categorie;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategorieInput {
    private String nomCategorie;

    public Categorie getEntity(){
        Categorie categorie=new Categorie() ;
        categorie.setNomCategorie(this.nomCategorie);
        return categorie ;
    }
}
