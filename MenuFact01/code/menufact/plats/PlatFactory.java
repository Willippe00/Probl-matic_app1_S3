package menufact.plats;
/**
 * Un factory servant à construire le plat selon le type fourni
 * @author Vincent Caron-Thibault, William Roberge
 * @version 1.0
 */

public class PlatFactory {

    /**
     * Creation du plat
     * @return le plat cree
     */
    public PlatAuMenu creerPlat(PlatType type, int code, String description, double prix, double proportion,
                                double kcal, double chol, double gras) {
        switch(type) {
            case PLATENFANT:
                return new PlatEnfant(code, description, prix, proportion);
            case PLATSANTE:
                return new PlatSante(code, description, prix, kcal, chol, gras);
            default:
                return new PlatAuMenu(code, description, prix);
        }
    }
}
