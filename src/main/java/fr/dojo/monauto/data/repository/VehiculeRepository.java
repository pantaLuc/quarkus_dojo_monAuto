package fr.dojo.monauto.data.repository;


/*adding Scoped to Inject Bean*/

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehiculeRepository implements PanacheRepository {


}
