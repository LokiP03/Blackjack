import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Scanner;



public class main {

    public static void main(String[] args) {
        Spieler player = new Spieler();
        Dealer dealer = new Dealer();
        Spielfeld playground = new Spielfeld();
        Karten cards = new Karten();


        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Blackjack ein!");
        String bg = scan.next();

        String ph = "bj";

        if (!bg.equals(ph)) {
            System.out.print("Error -1");
        } else {
            Karte karte1 = cards.getNewCard();
            Karte karte2 = cards.getNewCard();
            Karte[] cardsToDisplay = {karte1, karte2};
            playground.anzeigenBenutzer(cardsToDisplay);


            System.out.println("\n");
            System.out.println("Dealer:");
            Karte karte3 = cards.getNewCard();
            Karte karte4 = cards.getNewCard();

            System.out.println(karte3.getBezeichnung());
            System.out.println(karte4.getBezeichnung());

            System.out.println("\n");


            Spieler p1 = new Spieler();
            p1.player();

            System.out.println(karte1.getBezeichnung());
            System.out.println(karte2.getBezeichnung());
            System.out.println("\n");

            dealer.getDealerDecision();

        }
    }
}

