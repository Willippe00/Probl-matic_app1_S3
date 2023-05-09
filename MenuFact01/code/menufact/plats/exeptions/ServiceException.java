package menufact.plats.exeptions;

public class ServiceException extends Exception {
    public ServiceException(String message){
        super("FactureException: " + message);
    }
}
