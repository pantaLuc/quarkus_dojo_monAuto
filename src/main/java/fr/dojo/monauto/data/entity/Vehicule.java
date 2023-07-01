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

    public long getIDVehicule() {
        return IDVehicule;
    }

    public void setIDVehicule(long IDVehicule) {
        this.IDVehicule = IDVehicule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNbPLACECAB() {
        return NbPLACECAB;
    }

    public void setNbPLACECAB(int nbPLACECAB) {
        NbPLACECAB = nbPLACECAB;
    }

    public int getNbPlaceHCAB() {
        return NbPlaceHCAB;
    }

    public void setNbPlaceHCAB(int nbPlaceHCAB) {
        NbPlaceHCAB = nbPlaceHCAB;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "IDVehicule=" + IDVehicule +
                ", marque='" + marque + '\'' +
                ", type='" + type + '\'' +
                ", energie='" + energie + '\'' +
                ", serie='" + serie + '\'' +
                ", NbPLACECAB=" + NbPLACECAB +
                ", NbPlaceHCAB=" + NbPlaceHCAB +
                '}';
    }
}
