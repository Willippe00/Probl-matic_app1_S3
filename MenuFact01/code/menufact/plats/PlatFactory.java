package menufact.plats;
/**
 * Un factory servant à construire le plat selon le type fourni
 * @author Vincent Caron-Thibault, William Roberge
 * @version 1.0
 */

import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class PlatFactory {

    private ArrayList<PlatAuMenu> type_du_plat = new ArrayList<PlatAuMenu>();

    public PlatFactory()
    {
        //type_du_plat.add(PlatSante );

    }
    public PlatAuMenu creerPlat(PlatType type, int code, String description, double prix, double proportion,
                                double kcal, double chol, double gras,
                                ArrayList<IngredientInventaire> lesIngredients) {
        switch(type) {
            case PLATENFANT:
                return new PlatEnfant(code, description, prix, proportion, lesIngredients);
            case PLATSANTE:
                return new PlatSante(code, description, prix, kcal, chol, gras, lesIngredients);
            default:
                return new PlatAuMenu(code, description, prix, lesIngredients);
        }
    }


}
