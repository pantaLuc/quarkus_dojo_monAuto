package fr.dojo.monauto.web.graphql.input;


import fr.dojo.monauto.data.entity.Puissance;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuissanceInput {
    private int puissance;

    public Puissance getEntity(){
       Puissance puissance1=new Puissance();
       puissance1.setPuissance(this.getPuissance());
        return puissance1 ;
    }
}
