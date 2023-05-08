package menufact.facture;

 public abstract class FactureEtats {
     Facture facture;


     FactureEtats(Facture facture) {
         //this.facture = facture;
         new OUVERTEtState(facture);
     }

     FactureEtats()
     {

     }

     public abstract FactureEtats OUVERTE;
     public abstract FactureEtats FERMEE;

     public abstract FactureEtats PAYEE;

     enum Etat{
         UVERTE, FERMEE, PAYEE

     }
}

public class OUVERTEtState extends FactureEtat
{
    OUVERTEtState(Facture facture) {super(facture);}

    @Override
    public FactureEtat OUVERTE()
    {
        return this;
    }

    @Override
    public FactureEtat FERMEE() {
        return (new FERMEEState(facture));
    }

    @Override
    public FactureEtat PAYEE() {
        return null;
    }


}


public class FERMEEState extends FactureEtat
{
    @Override
    public FactureEtat OUVERTE() {
        return null;
    }

    @Override
    public FactureEtat FERMEE() {
        return null;
    }

    @Override
    public FactureEtat PAYEE() {
        return null;
    }
}

public class PAYEEState extends FactureEtat
{
    @Override
    public FactureEtat OUVERTE() {
        return null;
    }

    @Override
    public FactureEtat FERMEE() {
        return null;
    }

    @Override
    public FactureEtat PAYEE() {
        return null;
    }
}
 //OUVERTE, FERMEE, PAYEE
