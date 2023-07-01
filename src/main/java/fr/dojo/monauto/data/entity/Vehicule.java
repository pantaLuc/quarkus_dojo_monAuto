package fr.dojo.monauto.data.entity;

//TODO : Annotation pour persister en BD
//TODO : Sachant qu' un vehicule appartient à une ou plusieurs Client quelle relation doit-elle avoir avec Client ?
//TODO : Sachant qu' un vehicule est caracterisé par une puissance quelle relation doit d'elle avoir avec l' entité puissance

import jakarta.persistence.*;


/* creation de l' entity Vehicule qui sera notre fil conducteur */
@Entity
@Table(name = "vehicules")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVehicule")
    private long IDVehicule;

    private String Marque;
    private String type;
    private String energie;
    private String serie;
    private int NbPLACECAB;
    private int NbPlaceHCAB;
}
