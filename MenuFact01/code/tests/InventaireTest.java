package tests;

import ingredients.Ingredient;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventaireTest {

    @Test
    void testGetQuantite(){
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        inventaire.ajouter(ingredient, 5);
        assertEquals(5, inventaire.getQuantite(ingredient));
    }

    @Test
    void testGetIngredientAbsent() {
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        assertEquals(0, inventaire.getQuantite(ingredient));
    }

    @Test
    void testAjusterQuantite() throws IngredientException {
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        inventaire.ajouter(ingredient, 5);
        inventaire.ajusterQuantite(ingredient, 2);
        assertEquals(7, inventaire.getQuantite(ingredient));
    }

    @Test
    void testQuantiteNegative() {
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        inventaire.ajouter(ingredient, 5);

        Throwable exception = assertThrows(IngredientException.class, () -> {
            inventaire.ajusterQuantite(ingredient,-6);});
        assertEquals("IngredientException: Il n'est pas possible d'avoir une quantité negative",
                exception.getMessage());
    }

    @Test
    void testAjusterIngredientAbsent() {
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        Throwable exception = assertThrows(IngredientException.class, () -> {
            inventaire.ajusterQuantite(ingredient, 2);});
        assertEquals("IngredientException: L'ingredient ne se trouve pas dans l'inventaire",
                exception.getMessage());
    }
}