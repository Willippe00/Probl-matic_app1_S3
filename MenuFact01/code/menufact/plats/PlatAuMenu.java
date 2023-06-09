package menufact.plats;

import ingredients.IngredientInventaire;
import inventaire.Inventaire;

import java.util.ArrayList;

public class PlatAuMenu {

    Inventaire inventaire;
    private int code;
    private String description;
    private double prix;
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public PlatAuMenu(int code, String description, double prix,
                      ArrayList<IngredientInventaire> lesIngredients) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.lesIngredients = lesIngredients;
        inventaire.getInstance();
    }

    public PlatAuMenu() {

    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ArrayList<IngredientInventaire> getLesIngredients() {
        return lesIngredients;
    }

    public void setLesIngredients(ArrayList<IngredientInventaire> lesIngredients) {
        this.lesIngredients = lesIngredients;
    }
}
