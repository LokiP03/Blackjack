import java.util.Random;


public class Karten {

    public String getNewCard() {
        Random rnd = new Random();
        int spielkarte;
            String[] myCards = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
            spielkarte = 1 + rnd.nextInt(myCards.length - 1);
            //System.out.println(myCards[spielkarte]);



        return myCards[spielkarte];
    }
}
