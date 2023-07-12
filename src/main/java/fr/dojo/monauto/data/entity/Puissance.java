package fr.dojo.monauto.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

@Entity
@Table(name="puissances")
@Getter
@Setter
@ToString
public class Puissance {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idPuis")
    private int idPuis;

    @Column(name = "puissance")
    private int puissance;

}
