package menufact.Chef;
import menufact.plats.*;
import menufact.plats.exeptions.ServiceException;


public class Commander implements Observer {

    public Commander(PlatChoisi plat) throws ServiceException {
        Etat_des_plats middleware = Etat_des_plats.link(
                new menufact.plats.Commander(plat),
                new Preparation(plat),
                new Servir(plat));
    }




}
