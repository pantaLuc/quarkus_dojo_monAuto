package fr.dojo.monauto.web.graphql.input;


import fr.dojo.monauto.data.entity.Vehicule;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehiculeInput {
    private String marque;
    private String type;
    private String energie;
    private String serie;
    private int NbPLACECAB;
    private int NbPlaceHCAB;

    public Vehicule getEntity(){
        Vehicule vehicule =new Vehicule() ;
        vehicule.setMarque(this.marque);
        vehicule.setType(this.type);
        vehicule.setEnergie(this.energie);
        vehicule.setSerie(this.serie);
        vehicule.setNbPLACECAB(this.NbPLACECAB);
        vehicule.getNbPlaceHCAB();
        return vehicule ;
    }
}
