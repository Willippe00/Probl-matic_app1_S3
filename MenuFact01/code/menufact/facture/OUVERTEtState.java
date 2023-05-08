package menufact.facture;

public class OUVERTEtState extends FactureEtat {
    OUVERTEtState(Facture facture) {
        super(facture);
    }

    @Override
    public FactureEtat OUVERTE() {
        return this;
    }

    @Override
    public FactureEtat FERMEE() {
        return (new FERMEEState(facture));
    }

    @Override
    public FactureEtat PAYEE() {
        return (new PAYEEState(facture));
    }

    @Override
    public boolean EstOUVERTE() {
        return true;
    }

    @Override
    public boolean EstFERMEE() {
        return false;
    }

    @Override
    public boolean EstPAYEE() {
        return false;
    }


}
