package menufact;

import menufact.facture.Facture;
import menufact.facture.FactureControleur;
import menufact.facture.FactureVue;
import menufact.plats.*;

public class TestMenuFact01 {
    public static void main(String[] args) {

        try {
            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            //PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50);
            PlatFactory factory = new PlatFactory();
            PlatAuMenu p1 = factory.creerPlat(PlatType.PLATAUMENU, 0, "Frites sauce", 11.50,
                    0, 0, 0, 0);
            System.out.println(p1);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            //PlatAuMenu p2 = new PlatAuMenu(1, "Frites", 10.25);
            PlatAuMenu p2 = factory.creerPlat(PlatType.PLATAUMENU, 1, "Frites", 10.25,
                    0,0,0,0);
            System.out.println(p2);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            //PlatSante ps1 = new PlatSante(2, "Salade", 5.25, 100, 10, 1);
            PlatAuMenu ps1 = factory.creerPlat(PlatType.PLATSANTE, 2, "Salade", 5.25,
                    0, 100, 10, 1);
            System.out.println(ps1);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            //PlatSante ps2 = new PlatSante(3, "Salade Cesar", 8.25, 100, 10, 1);
            PlatAuMenu ps2 = factory.creerPlat(PlatType.PLATSANTE, 3, "Salade Cesar", 8.25,
                    0, 100, 10, 1);
            System.out.println(ps2);

            System.out.println("===menufact.Menu ajout avec 4 plats");
            Menu menu = new Menu("Menu1");
            menu.ajoute(p1);
            menu.ajoute(p2);
            menu.ajoute(ps1);
            menu.ajoute(ps2);
            System.out.println(menu);

            System.out.println("===menufact.Menu position 1, plat à la position 0");
            menu.position(0);
            System.out.println(menu.platCourant());

            System.out.println("===menufact.Menu position 1, plat à la position suivante 1");
            menu.positionSuivante();
            System.out.println(menu.platCourant());

            System.out.println("== Plat choisi");
            PlatChoisi pch1 = new PlatChoisi(p1, 5);
            System.out.println(pch1);
/*
            System.out.println("== New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajoutePlat(pch1);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println("== Ajout d'un plat choisie à la facture");
            PlatChoisi pch2 = new PlatChoisi(p2, 10);
            facture.ajoutePlat(pch2);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());
 */
            System.out.println("== New menufact.facture.Facture");
            Facture fact = new Facture("Ma facture");
            FactureVue vue = new FactureVue();
            FactureControleur facture = new FactureControleur(fact, vue);
            facture.stringVue();

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajoutePlat(pch1);
            facture.stringVue();
            System.out.println(fact.sousTotal());

            System.out.println("== Ajout d'un plat choisie à la facture");
            PlatChoisi pch2 = new PlatChoisi(p2, 10);
            facture.ajoutePlat(pch2);
            facture.stringVue();
            System.out.println(fact.sousTotal());

            System.out.println(fact.total());
            facture.ouvrir();
            facture.stringVue();
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            facture.stringVue();
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            facture.stringVue();
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            facture.stringVue();
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            facture.stringVue();
            System.out.println("Etat = " + facture.getEtat());

        }catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

    }
}
