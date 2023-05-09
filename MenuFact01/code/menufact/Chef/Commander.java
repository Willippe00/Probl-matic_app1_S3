package menufact.Chef;
import inventaire.Inventaire;
import menufact.plats.*;
import menufact.plats.exeptions.ServiceException;


public class Commander implements Observer {
    public Etat_des_plats middleware;
    public Commander(PlatChoisi plat, Inventaire inventaire) throws ServiceException {
                middleware = Etat_des_plats.link(
                new menufact.plats.Commander(plat),
                new Preparation(plat, inventaire),
                new Servir(plat));
    }




}
