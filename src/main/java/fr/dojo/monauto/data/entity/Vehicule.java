package fr.dojo.monauto.data.entity;

//TODO : Annotation pour persister en BD
//TODO : Sachant qu' un vehicule appartient à une ou plusieurs Client quelle relation doit-elle avoir avec Client ?
//TODO : Sachant qu' un vehicule est caracterisé par une puissance quelle relation doit d'elle avoir avec l' entité puissance

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/* creation de l' entity Vehicule qui sera notre fil conducteur */
@Entity
@Getter
@Setter
@ToString
@Table(name = "vehicules")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVehicule")
    private long IDVehicule;

    @Column(name = "marque")
    private String marque;
    @Column(name = "type")
    private String type;
    @Column(name = "energie")
    private String energie;
    @Column(name = "serie")
    private String serie;
    @Column(name = "NbPLACECAB")
    private int NbPLACECAB;
    @Column(name = "NbPlaceHCAB")
    private int NbPlaceHCAB;
}
