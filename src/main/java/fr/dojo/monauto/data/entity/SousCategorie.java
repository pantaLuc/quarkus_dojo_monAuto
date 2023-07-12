package fr.dojo.monauto.data.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sousCategorie")
@Getter
@Setter
public class SousCategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSousCategorie")
    private int idSousCategorie;
    @Column(name="libelleSousCategorie")
    private String libelleSousCategorie;
}
