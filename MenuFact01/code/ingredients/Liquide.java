package ingredients;

public class Liquide implements  TypeConsistance{
    État étatIngredient = null;
    Unitee uniteeIngredient = null;

    public Liquide()
    {
        étatIngredient = État.LIQUIDE;
        uniteeIngredient = Unitee.ML;

    }



    @Override
    public État getÉtat() {
        return null;
    }

    @Override
    public Unitee getUnitee() {
        return null;
    }
}
