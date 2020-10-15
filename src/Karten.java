import java.util.Random;

public class Karten {

    private static Karte[] getAvailableCards() {
        Karte[] myCards = new Karte[13];
        myCards[0]=new Karte(2,"Two");
        myCards[1]=new Karte(3,"Three");
        myCards[2]=new Karte(4,"Four");
        myCards[3]=new Karte(5,"Five");
        myCards[4]=new Karte(6,"Six");
        myCards[5]=new Karte(7,"Seven");
        myCards[6]=new Karte(8,"Eight");
        myCards[7]=new Karte(9,"Nine");
        myCards[8]=new Karte(10,"Ten");
        myCards[9]=new Karte(10,"Jack");
        myCards[10]=new Karte(10,"Queen");
        myCards[11]=new Karte(10,"King");
        myCards[12]=new Karte(11,"Ace");
        return myCards;
    }

    public static Karte getNewCard() {
        Random rnd = new Random();
        return getAvailableCards()[1 + rnd.nextInt(getAvailableCards().length - 1)];
    }
}
