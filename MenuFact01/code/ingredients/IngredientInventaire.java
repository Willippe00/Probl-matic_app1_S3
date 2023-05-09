package ingredients;

import ingredients.exceptions.IngredientException;

/**
 * Les informations pour un ingredient dans l'inventaire
 * @author Vincent Caron-Thibault, William Roberge
 * @version 1.0
 */

public class IngredientInventaire {
    private Ingredient ingredient;
    private int quantite;

    /**
     * Constructeur d'un inventaire pour un ingredient avec sa quantite
     */
    public IngredientInventaire(Ingredient ingredient, int quantite) {
        this.ingredient = ingredient;
        this.quantite = quantite;
    }

    /**
     * @return l'ingredient contenu dans l'inventaire
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     * @return la quantite de l'ingredient
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Permet d'ajuster la quantite de l'ingredient dans l'inventaire
     */
    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }
}
