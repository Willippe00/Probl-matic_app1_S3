package ingredients;

public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;
    private TypeConsistance typeConsistance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    public TypeConsistance getTypeConsistance() { return typeConsistance;}
    public void setTypeConsistance(TypeConsistance typeConsistance) { this.typeConsistance = typeConsistance;}
}
