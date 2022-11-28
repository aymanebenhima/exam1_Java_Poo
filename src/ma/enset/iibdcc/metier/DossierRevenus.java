package ma.enset.iibdcc.metier;

public class DossierRevenus extends Dossier {

    private double ca;

    public DossierRevenus(long id, double ca) {
        super(id);
        this.ca = ca;

        calculerMontant();
    }

    @Override
    protected void calculerMontant() {

        montant = ca * 0.15;
    }

    @Override
    public String toString() {
        return "15% de revenus " + ca + ", Montant : "+montant;
    }
}
