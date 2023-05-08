package menufact.facture;

 public abstract class FactureEtat {
     Facture facture;


     FactureEtat(Facture facture) {
         //this.facture = facture;

     }

     FactureEtat()
     {

     }

     public abstract FactureEtat OUVERTE();
     public abstract FactureEtat FERMEE();

     public abstract FactureEtat PAYEE();

     public abstract boolean  EstOUVERTE();

     public abstract boolean  EstFERMEE();

     public abstract boolean  EstPAYEE();

     enum Etat{
         UVERTE, FERMEE, PAYEE

     }
}


//OUVERTE, FERMEE, PAYEE
