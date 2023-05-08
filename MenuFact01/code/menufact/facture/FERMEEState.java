package menufact.facture;

public class FERMEEState extends FactureEtat {

    FERMEEState(Facture facture) {
        super(facture);
    }

    @Override
    public FactureEtat OUVERTE() {
        return (new OUVERTEtState(facture));
    }

    @Override
    public FactureEtat FERMEE() {
        return this;


    }

    @Override
    public FactureEtat PAYEE() {
        return new FERMEEState(facture);
    }

    @Override
    public boolean EstOUVERTE() {
        return false;
    }

    @Override
    public boolean EstFERMEE() {
        return true;
    }

    @Override
    public boolean EstPAYEE() {
        return false;
    }
}
