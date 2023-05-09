package tests;

import ingredients.exceptions.IngredientException;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import org.junit.jupiter.api.Test;
import menufact.facture.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactureTest {
    @Test
    void Test_CréationFacture()
    {
      Facture facture1 = new Facture("facture de rémie");
      assert (facture1 != null);

    }

    @Test
    void  TestouverturFacture() throws FactureException {
        Facture facture1 = new Facture("facture de rémie");
        facture1.ouvrir();
        assert (facture1.getEtat().EstOUVERTE() == true);
    }

    @Test
    void  TestFactureFermer() throws FactureException {
        Facture facture1 = new Facture("facture de rémie");
        facture1.fermer();
        assert (facture1.getEtat().EstOUVERTE() == false);
    }

    @Test
    void  TestajouterPlatFactureOuverte() throws FactureException {
        Facture facture1 = new Facture("facture de rémie");
        facture1.ajoutePlat(new PlatChoisi(new PlatAuMenu(),1));

    }

    @Test
    void  TestouverturFactureFermer() throws FactureException {
        Facture facture1 = new Facture("facture de rémie");
        facture1.ajoutePlat(new PlatChoisi(new PlatAuMenu(),1));

        facture1.payer();


        Throwable exception = assertThrows(FactureException.class, () -> {
            facture1.ouvrir();;});
        assertEquals("FactureException: La facture ne peut pas être reouverte.",
                exception.getMessage());

    }





}
