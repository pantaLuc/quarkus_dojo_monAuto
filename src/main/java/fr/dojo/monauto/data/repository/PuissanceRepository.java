package fr.dojo.monauto.data.repository;

import fr.dojo.monauto.data.entity.Puissance;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class PuissanceRepository  implements PanacheRepository<Puissance> {

public List<Puissance> findByPuissance(long puissance){
    return this.find("puissance" ,puissance).stream().toList();
}


}
