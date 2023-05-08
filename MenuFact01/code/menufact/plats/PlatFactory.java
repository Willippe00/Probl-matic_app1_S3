package menufact.plats;

public class PlatFactory {
    public PlatAuMenu creerPlat(PlatType type, int code, String description, double prix, double proportion,
                                double kcal, double chol, double gras) {
        switch(type) {
            case PLATENFANT:
                return new PlatEnfant(code, description, prix, proportion);
            case PLATSANTE:
                return new PlatSante(code, description, prix, kcal, chol, gras);
            default:
                return new PlatAuMenu(code, description, prix);
        }
    }
}
