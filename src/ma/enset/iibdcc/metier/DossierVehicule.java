package ma.enset.iibdcc.metier;

public class DossierVehicule extends Dossier {

    private int nbChevaux;
    private char categorie;

    public DossierVehicule(long id, int nbc, char cat) {
        super(id);
        this.nbChevaux = nbc;
        this.categorie = cat;
        calculerMontant();
    }


    @Override
    protected void calculerMontant() {

        if (nbChevaux < 8) montant = categorie == 'E' ? 350 : 700;
        else if (nbChevaux <= 10) montant = categorie == 'E' ? 650 : 1500;
        else if (nbChevaux <= 14) montant = categorie == 'E' ? 3000 : 6000;
        else montant = categorie == 'E' ? 8000 : 20000;

    }

    @Override
    public String toString() {
        return "Vehicule "+ categorie +" "+ nbChevaux +" CH, montant : "+montant;
    }
}
