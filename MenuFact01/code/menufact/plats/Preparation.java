package menufact.plats;
import ingredients.Ingredient;
import inventaire.Inventaire;


import ingredients.exceptions.IngredientException;
import menufact.plats.exeptions.ServiceException;

public class Preparation extends Etat_des_plats{

    public Preparation(PlatChoisi plat) throws ServiceException {

    }



    @Override
    public boolean verifier(PlatChoisi plat) throws ServiceException{
        return false;
    }
}
