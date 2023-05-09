package tests;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IngredientTest {
    @Test
    void testIngredient(){
        Ingredient ingredient = new Ingredient();
        ingredient.setNom("Poivre");
        ingredient.setDescription("Ca pique!");
        ingredient.setTypeIngredient(TypeIngredient.EPICE);
        ingredient.setTypeConsistance(TypeConsistance.SOLIDE);

        assertEquals(ingredient.getNom(),"Poivre");
        assertEquals("Ca pique!", ingredient.getDescription());
        assertEquals(ingredient.getTypeIngredient(), TypeIngredient.EPICE);
        assertEquals(TypeConsistance.SOLIDE, ingredient.getTypeConsistance());

        ingredient.setTypeConsistance(TypeConsistance.LIQUIDE);
        assertEquals(TypeConsistance.LIQUIDE, ingredient.getTypeConsistance());
    }
    @Test
    void testEpice() {
        Ingredient epice = new Epice();
        assertEquals(epice.getTypeIngredient(), TypeIngredient.EPICE);
    }

    @Test
    void testFruit() {
        Ingredient fruit = new Fruit();
        assertEquals(fruit.getTypeIngredient(), TypeIngredient.FRUIT);
    }

    @Test
    void testLaitier() {
        Ingredient laitier = new Laitier();
        assertEquals(laitier.getTypeIngredient(), TypeIngredient.LAITIER);
    }

    @Test
    void testLegume() {
        Ingredient legume = new Legume();
        assertEquals(legume.getTypeIngredient(), TypeIngredient.LEGUME);
    }

    @Test
    void testViande() {
        Ingredient viande = new Viande();
        assertEquals(viande.getTypeIngredient(), TypeIngredient.VIANDE);
    }

    @Test
    void testIngredientInventaire() {
        Ingredient ingredient = new Ingredient();
        IngredientInventaire inventaire = new IngredientInventaire(ingredient, 3);
        assertEquals(inventaire.getIngredient(), ingredient);
        assertEquals(inventaire.getQuantite(), 3);
    }

    @Test
    void testIngredientInventaireAjuster() throws IngredientException {
        Ingredient ingredient = new Ingredient();
        IngredientInventaire inventaire = new IngredientInventaire(ingredient, 3);
        inventaire.setQuantite(2);
        assertEquals(inventaire.getQuantite(), 2);
    }

    @Test
    void testQuantiteNegative() {
        Ingredient ingredient = new Ingredient();
        IngredientInventaire inventaire = new IngredientInventaire(ingredient, 5);
        Throwable exception = assertThrows(IngredientException.class, () -> {
            inventaire.setQuantite(-2);});
        assertEquals("IngredientException: Il n'est pas possible d'avoir une quantité negative",
                exception.getMessage());
    }
}
