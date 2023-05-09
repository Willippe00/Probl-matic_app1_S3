package menufact.plats;

import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    public PlatEnfant() {
    }

    public PlatEnfant(int code, String description, double prix, double proportion,
                      ArrayList<IngredientInventaire> lesIngredients) {
        super(code, description, prix, lesIngredients);
        this.proportion = proportion;
    }

    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
