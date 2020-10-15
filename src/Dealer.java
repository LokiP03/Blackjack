import java.util.Random;
public class Dealer {
    public void getDealerDecision() {
        Karten cards = new Karten();
        Random rnd = new Random();
        int auswahl;

        String[] myauswahl = {"Hit", "Stand"};

        auswahl = 1 + rnd.nextInt(myauswahl.length - 1);



        switch (myauswahl[auswahl]){

            case "Hit":
                String karte8 = cards.getNewCard().getBezeichnung();
                System.out.println(karte8);
                break;

            case "Stand":

                System.out.println("Stand");
                break;

            default:
                System.out.println("Error");

        }
    }
}
