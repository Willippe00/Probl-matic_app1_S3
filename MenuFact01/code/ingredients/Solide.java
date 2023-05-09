package ingredients;

public class Solide implements  TypeConsistance{
    État étatIngredient = null;
    Unitee uniteeIngredient = null;

    public Solide()
    {
        étatIngredient = État.SOLIDE;
        uniteeIngredient = Unitee.G;

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
