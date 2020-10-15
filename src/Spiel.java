public class Spiel {
    Mensch mensch = new Mensch();
    Dealer dealer = new Dealer();

    public void Start() {
        mensch.getFirstCards();
        dealer.getFirstCards();
        mensch.ausgabe();
        dealer.ausgabe();
        mensch.entscheiden();
        if (mensch.getPunkte() <= 21) {
            dealer.entscheiden();
        }
        ausgabeSieger();
        restart();

    }
    public void restart() {
        mensch.restart();
        dealer.restart();
        Start();
    }

    public void ausgabeSieger() {
        if (mensch.getPunkte() > 21) {
            System.out.println("Computer hat Gewonnen");
        } else if (dealer.getPunkte() > 21) {
            System.out.println("Spieler hat Gewonnen");
        } else if (dealer.getPunkte() < mensch.getPunkte()) {
            System.out.println("Spieler hat Gewonnen");
        } else if (mensch.getPunkte() < dealer.getPunkte()) {
            System.out.println("Computer hat Gewonnen");
        } else {
            System.out.println("Unentschieden");
        }
    }
}
