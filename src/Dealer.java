import java.util.Random;
import java.util.Scanner;

public class Dealer extends Spieler {
    public void ausgabe() {
        ausgabe("Dealer");
    }
    public void entscheiden() {
        String Hit = "hit";;
        if (getPunkte()<17) {
            getNewCard(anzahlKarten);
        }
        ausgabe();
        if (getPunkte()<17){
            entscheiden();
        }
    }
    /*public void getDealerDecision() {
        Karten cards = new Karten();
        Random rnd = new Random();
        int auswahl;

        String[] myauswahl = {"Hit", "Stand"};

        auswahl = 1 + rnd.nextInt(myauswahl.length - 1);



        if (karte3.getWert < 17){
            Karte karte8 = cards.getNewCard();

            System.out.println(karte8.getBezeichnung());


        } else {


        }

     */
    }

