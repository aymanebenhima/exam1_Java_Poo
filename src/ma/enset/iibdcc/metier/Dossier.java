package ma.enset.iibdcc.metier;

public abstract class Dossier {

    private long id;

    protected double montant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Dossier(long id) {
        this.id = id;
    }

     protected abstract void calculerMontant();


}
