package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;

import java.util.ArrayList;

/**
 * Un inventaire pour les ingrédients
 * @author Vincent Caron-Thibault, William Roberge
 * @version 1.0
 */

public class Inventaire {

    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    private Inventaire()
    {

    }

    private static Inventaire instance;
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    /**
     * Permet d'ajouter un ingredient a l'inventaire
     * en specifiant l'ingredient et sa quantite
     */
    public void ajouter (Ingredient ingredient, int quanite) {
        lesIngredients.add(new IngredientInventaire(ingredient, quanite));
    }

    /**
     * @return la quantite presente en inventaire d'un ingredient specifie
     */
    public int getQuantite(Ingredient ingredient){
        for(IngredientInventaire inventaire : lesIngredients){
            if(inventaire.getIngredient().equals(ingredient)){
                return inventaire.getQuantite();
            }
        }
        return 0;
    }

    /**
     * Permet de modifier la quantite d'un ingredient dans l'inventaire
     */
    public void ajusterQuantite(Ingredient ingredient, int quantite) throws IngredientException{
        for(IngredientInventaire inventaire : lesIngredients){
            if(inventaire.getIngredient().equals(ingredient)){
                inventaire.setQuantite(inventaire.getQuantite()+quantite);
                return;
            }
        }
        throw new IngredientException("L'ingredient ne se trouve pas dans l'inventaire");
    }
}
