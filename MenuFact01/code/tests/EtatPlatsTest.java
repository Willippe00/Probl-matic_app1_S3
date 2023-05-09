package tests;
import inventaire.Inventaire;
import menufact.plats.*;

import menufact.plats.exeptions.ServiceException;
import org.junit.jupiter.api.Test;

public class EtatPlatsTest {

    PlatChoisi PlatTest = new PlatChoisi(new PlatAuMenu(), 1);
    Inventaire inventaire= null;

    Etat_des_plats middleware;
    @Test
    void testCommndeNormale() throws ServiceException {
        inventaire.getInstance();


        middleware = Etat_des_plats.link(
                new menufact.plats.Commander(PlatTest),
                new Preparation(PlatTest, inventaire),
                new Servir(PlatTest));
        assert (middleware!=null);

    }
}
