package menufact.plats;
import ingredients.Ingredient;
import ingredients.Legume;
import ingredients.*;
import inventaire.Inventaire;


import ingredients.exceptions.IngredientException;
import menufact.facture.exceptions.FactureException;
import menufact.plats.exeptions.ServiceException;

import java.util.ArrayList;

public class Preparation extends Etat_des_plats{
    private ArrayList<IngredientInventaire> Ingredients;
    public Preparation(PlatChoisi plat, Inventaire inventaire) throws ServiceException {
        Ingredients = plat.getPlat().getLesIngredients();

        for(int i =0; i<Ingredients.size(); i++)
        {
            if(inventaire.getQuantite(Ingredients.get(i).getIngredient() )<0)
            {
                throw new ServiceException("impossible de préparer le repas");
            }

        }

    }



    @Override
    public boolean verifier(PlatChoisi plat) throws ServiceException{
        return false;
    }
}
