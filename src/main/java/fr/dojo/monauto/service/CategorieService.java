package fr.dojo.monauto.service;

import fr.dojo.monauto.data.entity.Categorie;
import fr.dojo.monauto.data.repository.CategorieRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityExistsException;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class CategorieService {
    @Inject
    CategorieRepository categorieRepository ;

    public List<Categorie> categorieList(){return this.categorieRepository.listAll() ;}

    public Categorie addCategorie(Categorie categorie){
        if(categorieRepository.findByNomCategorie(categorie.getNomCategorie()) ==null){
            this.categorieRepository.persist(categorie);
            return categorie ;
        }
         throw new EntityExistsException("cette categorie existe dejaé");
    }

    public Categorie findById(long idCategorie){
        Categorie categorie =categorieRepository.findById(idCategorie) ;
        if( categorie ==null){
            throw new NotFoundException("Element n' existe pas ") ;
        }
        return categorie ;
    }

    public Categorie findByNomCategorie(String nomCategorie){
        Categorie categorie=categorieRepository.findByNomCategorie(nomCategorie);

        if(categorie==null){
            throw new NotFoundException("Element n' existe pas ") ;
        }
        return categorie ;
    }
}
