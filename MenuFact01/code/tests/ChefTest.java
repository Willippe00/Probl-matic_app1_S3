package tests;

import menufact.Chef.Chef;
import menufact.Chef.Commander;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;
import menufact.plats.exeptions.ServiceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


//package menufact.Chef;

        import menufact.plats.PlatAuMenu;
        import menufact.plats.PlatChoisi;
        import menufact.plats.PlatSante;
        import menufact.plats.exeptions.ServiceException;
        import org.junit.jupiter.api.Test;



        import static org.junit.jupiter.api.Assertions.*;

public class ChefTest {
    @Test
    void Test_du_Chef()
    {

        Chef Gaston;
        Gaston = Chef.getIntance();
        assertNotNull(Gaston );
    }

    @Test
    void Test_notification() throws ServiceException {

        PlatAuMenu PlatSante = new PlatSante();
        Commander Gaston2 = new Commander(new PlatChoisi(PlatSante, 6));

        assert (Gaston2.middleware!=null);

    }
}