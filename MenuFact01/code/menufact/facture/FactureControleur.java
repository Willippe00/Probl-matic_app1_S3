package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;
import menufact.facture.exceptions.FactureException;

/**
 * Un controleur pour une facture
 * @author Vincent Caron-Thibault, William Roberge
 * @version 1.0
 */

public class FactureControleur {
    private Facture fact;
    private FactureVue vue;

    public FactureControleur(Facture f, FactureVue v){
        this.fact = f;
        this.vue = v;
    }

    /**
     *
     * @param client le client de la facture
     */
    public void associerClient(Client client){fact.associerClient(client);}

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer() {fact.payer();}

    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer() {fact.fermer();}

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException {fact.ouvrir();}

    /**
     *
     * @return l'état de la facture
     */
    public FactureEtat getEtat() {return fact.getEtat();}

    public void ajoutePlat(PlatChoisi plat) throws FactureException { fact.ajoutePlat(plat);}

    public void stringVue() {
        vue.affiche(fact.toString());
    }

    public void factVue() {
        vue.affiche(fact.genererFacture());
    }
}
