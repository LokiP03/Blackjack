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
            String karte1 = cards.getNewCard();
            String karte2 = cards.getNewCard();
            String[] cardsToDisplay = {karte1, karte2};
            playground.anzeigenBenutzer(cardsToDisplay);


            System.out.println("\n");
            System.out.println("Dealer:");
            String karte3 = cards.getNewCard();
            String karte4 = cards.getNewCard();

            System.out.println(karte3);
            System.out.println(karte4);

            System.out.println("\n");


            Spieler p1 = new Spieler();
            p1.player();

            System.out.println(karte1);
            System.out.println(karte2);
            System.out.println("\n");

            dealer.getDealerDecision();

        }
    }
}

