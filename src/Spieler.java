public class Spieler {
    protected Karte[] karten = new Karte[6];
    protected int anzahlKarten = 0;

    public void getNewCard(int pos) {
        karten[pos] = Karten.getNewCard();
        anzahlKarten++;
    }

    public void getFirstCards() {
        getNewCard(0);
        getNewCard(1);
    }

    protected void ausgabe(String spieler) {
        System.out.println("\n");
        System.out.println(spieler + ":");
        for (int x = 0; x < anzahlKarten; x++) {
            System.out.println(karten[x].getBezeichnung());
        }
        System.out.println("Punkte: " + getPunkte());

    }

    public int getPunkte() {
        int punkte = 0;
        for (int x = 0; x < anzahlKarten; x++) {
            if ((punkte + karten[x].getWert()) > 21 && karten[x].getWert() == 11) {
                punkte += 1;
            } else {
                punkte += karten[x].getWert();
            }
        }
            return punkte;
    }

        public void restart(){
            karten = new Karte[6];
            anzahlKarten = 0;
        }
    }

