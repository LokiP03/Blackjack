import java.util.Scanner;
class Spieler {
    public void player() {
        Karten cards = new Karten();
        Scanner sc = new Scanner(System.in);
        String Hit = "hit";
        String Stand = "stand";
        String Dhit = "dhit";
        System.out.println("hit, stand oder dhit: ");
        String auswahl = sc.next();
        if(auswahl.equals(Hit)) {

            String karte5 = cards.getNewCard();

            System.out.println(karte5);

        } else if(auswahl.equals(Stand)) {
            System.out.println("Stand");
        } else if(auswahl.equals(Dhit)) {

            String karte6 = cards.getNewCard();
            String karte7 = cards.getNewCard();

            System.out.println(karte6);
            System.out.println(karte7);

        } else {
            System.out.println("Falsche Wahl");
        }
    }

}
