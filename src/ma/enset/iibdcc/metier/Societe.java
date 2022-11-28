package ma.enset.iibdcc.metier;

import java.util.ArrayList;
import java.util.List;

public class Societe {

    private long id;
    private String raison_sociale;
    private List<Impots> impots = new ArrayList<>();

    public Societe(long id, String raison_sociale) {
        this.id = id;
        this.raison_sociale = raison_sociale;
    }


    public Impots getImpots(int annee) {

        for (Impots impot : impots) {
            if (impot.getAnnee() == annee) {

                return impot;
            }
        }
        return null;
    }

    public void addImpots(Impots imp) {
        impots.add(imp);
    }

    @Override
    public String toString() {
        return "Societe{" +
                "id=" + id +
                ", raison_sociale='" + raison_sociale + '\'' +
                '}';
    }
}
