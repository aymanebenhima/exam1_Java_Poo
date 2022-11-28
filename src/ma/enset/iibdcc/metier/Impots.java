package ma.enset.iibdcc.metier;

import java.util.ArrayList;
import java.util.List;

public class Impots {

    private int annee;
    private double totalImpot;
    private List<Dossier> dossiers = new ArrayList<>();

    public Impots(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return annee;
    }

    public void add(Dossier dossier) {
        dossiers.add(dossier);
        totalImpot+= dossier.montant;
    }

    @Override
    public String toString() {
        return "Liste des Impots "  + annee +
                ", dossiers=" + dossiers +
                ", totalImpot=" + totalImpot +
                '}';
    }
}
