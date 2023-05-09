package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public void ajouter (Ingredient ingredient, int quanite) {
        lesIngredients.add(new IngredientInventaire(ingredient, quanite));
    }

    public int getQuantite(Ingredient ingredient){
        for(IngredientInventaire inventaire : lesIngredients){
            if(inventaire.getIngredient().equals(ingredient)){
                return inventaire.getQuantite();
            }
        }
        return 0;
    }

    public void ajusterQuantite(Ingredient ingredient, int quantite) throws IngredientException{
        for(IngredientInventaire inventaire : lesIngredients){
            if (inventaire.getIngredient().equals(ingredient)){
                inventaire.setQuantite(inventaire.getQuantite() + quantite);
            }
        }
        throw new IngredientException("L'ingredient ne se trouve pas dans l'inventaire");
    }
}
