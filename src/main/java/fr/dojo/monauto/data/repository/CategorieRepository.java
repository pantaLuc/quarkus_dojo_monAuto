package fr.dojo.monauto.data.repository;

import fr.dojo.monauto.data.entity.Categorie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategorieRepository implements PanacheRepository<Categorie> {
    public Categorie findByNomCategorie(String nomCategorie){
        return find("nomCategorie" ,nomCategorie).firstResult() ;
    }
}
