package menufact.facture;

public class PAYEEState extends FactureEtat {
    PAYEEState(Facture facture) {
        super(facture);
    }
    @Override
    public FactureEtat OUVERTE() {
        return new OUVERTEtState(facture);
    }

    @Override
    public FactureEtat FERMEE() {
        return new FERMEEState(facture);
    }

    @Override
    public FactureEtat PAYEE() {
        return this;
    } // retourner une erreur

    @Override
    public boolean EstOUVERTE() {
        return false;
    }

    @Override
    public boolean EstFERMEE() {
        return false;
    }

    @Override
    public boolean EstPAYEE() {
        return true;
    }
}
