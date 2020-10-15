import java.util.Scanner;
class Mensch extends Spieler {
    public void ausgabe() {
        ausgabe("Spieler");

    }
    public void entscheiden() {
        Scanner sc = new Scanner(System.in);
        String Hit = "hit";
        String Stand = "stand";
        System.out.println("hit or stand: ");
        String auswahl = sc.next();
        if(auswahl.equals(Hit)) {
            getNewCard(anzahlKarten);
        }
        else if (auswahl.equals(Stand)) {
            return;
        }
    ausgabe();
        if (getPunkte()<21){
            entscheiden();
        }
    }
}


