import java.util.Random;
public class Dealer {
    public void getDealerDecision() {
        Karten cards = new Karten();
        Random rnd = new Random();
        int auswahl;

        String[] myauswahl = {"Hit", "Stand", "Dhit"};

        auswahl = 1 + rnd.nextInt(myauswahl.length - 1);


        switch (myauswahl[auswahl]){

            case "Hit":
                String karte8 = cards.getNewCard();
                System.out.println(karte8);
                break;

            case "Stand":

                System.out.println("Stand");
                break;

            case "Dhit":
                String karte9 = cards.getNewCard();
                String karte10 = cards.getNewCard();
                System.out.println(karte9);
                System.out.println(karte10);
                break;

            default:
                System.out.println("Error");

        }
    }
}
