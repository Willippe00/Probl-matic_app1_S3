package tests;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    @Test
    void testIngredient(){
        Ingredient ingredient = new Ingredient();
        ingredient.setNom("Poivre");
        ingredient.setDescription("Ca pique!");
        ingredient.setTypeIngredient(TypeIngredient.EPICE);
        assert(ingredient.getNom().equals("Poivre"));
        assert(ingredient.getDescription().equals("Ca pique!"));
        assert(ingredient.getTypeIngredient() == TypeIngredient.EPICE);
    }
    @Test
    void testEpice() {
        Ingredient epice = new Epice();
        assert (epice.getTypeIngredient() == TypeIngredient.EPICE);
    }

    @Test
    void testFruit() {
        Ingredient fruit = new Fruit();
        assert (fruit.getTypeIngredient() == TypeIngredient.FRUIT);
    }

    @Test
    void testLaitier() {
        Ingredient laitier = new Laitier();
        assert(laitier.getTypeIngredient() == TypeIngredient.LAITIER);
    }

    @Test
    void testLegume() {
        Ingredient legume = new Legume();
        assert(legume.getTypeIngredient() == TypeIngredient.LEGUME);
    }

    @Test
    void testViande() {
        Ingredient viande = new Viande();
        assert(viande.getTypeIngredient() == TypeIngredient.VIANDE);
    }

    @Test
    void testIngredientInventaire() {
        Ingredient ingredient = new Ingredient();
        IngredientInventaire inventaire = new IngredientInventaire(ingredient, 3);
        assert(inventaire.getIngredient() == ingredient);
        assert(inventaire.getQuantite() == 3);
    }

    @Test
    void testIngredientInventaireAjuster() throws IngredientException {
        Ingredient ingredient = new Ingredient();
        IngredientInventaire inventaire = new IngredientInventaire(ingredient, 3);
        inventaire.setQuantite(2);
        assertEquals(inventaire.getQuantite(), 2);
    }
}
