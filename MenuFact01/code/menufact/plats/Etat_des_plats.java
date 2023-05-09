package menufact.plats;

import menufact.plats.exeptions.ServiceException;

public abstract class Etat_des_plats {

    private Etat_des_plats next;

    public static Etat_des_plats link(Etat_des_plats first, Etat_des_plats... chain) {
        Etat_des_plats head = first;
        for (Etat_des_plats nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean verifier(PlatChoisi plat) throws ServiceException;


}
