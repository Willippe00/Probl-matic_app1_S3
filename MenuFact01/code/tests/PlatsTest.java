package tests;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatFactory;
import menufact.plats.PlatType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlatsTest {

    private PlatFactory factory = new PlatFactory();
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();
    private Ingredient ing1 = new Ingredient();
    private IngredientInventaire invIng1 = new IngredientInventaire(ing1, 3);

    @Test
    public void testGettersPlatAuMenu() {
        lesIngredients.add(invIng1);
        PlatAuMenu plat = factory.creerPlat(PlatType.PLATAUMENU, 0, "Gyros", 11.50,
                0, 0, 0, 0, lesIngredients);

        String texteAttendu = "menufact.plats.PlatAuMenu{" +
                "code=" + plat.getCode() +
                ", description='" + plat.getDescription() + '\'' +
                ", prix=" + plat.getPrix() +
                "}\n";

        assertEquals(texteAttendu, plat.toString());
        assertEquals(lesIngredients, plat.getLesIngredients());
    }

    @Test
    public void testSettersPLatAuMenu() {
        PlatAuMenu plat = factory.creerPlat(PlatType.PLATAUMENU, 0, "Gyros", 11.50,
                0, 0, 0, 0, lesIngredients);

        ArrayList<IngredientInventaire> nouveauxIngredients = new ArrayList<IngredientInventaire>();
        nouveauxIngredients.add(invIng1);

        plat.setCode(2);
        plat.setDescription("Pitas");
        plat.setPrix(15.00);
        plat.setLesIngredients(nouveauxIngredients);

        String texteAttendu = "menufact.plats.PlatAuMenu{" +
                "code=" + plat.getCode() +
                ", description='" + plat.getDescription() + '\'' +
                ", prix=" + plat.getPrix() +
                "}\n";

        assertEquals(texteAttendu, plat.toString());
        assertEquals(nouveauxIngredients, plat.getLesIngredients());
    }

}