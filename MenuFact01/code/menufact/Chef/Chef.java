package menufact.Chef;
import menufact.plats.PlatChoisi;
import menufact.plats.exeptions.ServiceException;


public class Chef {

    private static Chef instance;
    Chef()
    {


    }

    public static synchronized Chef getIntance()
    {
        if (instance == null)
            instance = new Chef();

        return instance;

    }

    public void notifier(PlatChoisi plat) throws ServiceException {
        Commander notification = new Commander(plat);

    }
}
