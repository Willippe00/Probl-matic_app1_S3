package tests;

import ingredients.Ingredient;
import inventaire.Inventaire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventaireTest {

    @Test
    void testGetQuantite(){
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        inventaire.ajouter(ingredient, 5);
        assertEquals(5, inventaire.getQuantite(ingredient));
    }
    /*
    @Test
    void testAjusterQuantite(){
        Inventaire inventaire = new Inventaire();
        Ingredient ingredient = new Ingredient();

        inventaire.ajouter(ingredient, )
    }
*/
}