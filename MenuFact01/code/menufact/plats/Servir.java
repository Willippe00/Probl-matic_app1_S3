package menufact.plats;

import menufact.plats.exeptions.ServiceException;

public class Servir extends Etat_des_plats {
    public Servir(PlatChoisi plat)
    {
        // a implémenter
    }

    @Override
    public boolean verifier(PlatChoisi plat) throws ServiceException {
        return false;
    }
}
