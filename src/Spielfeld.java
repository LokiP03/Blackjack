public class Spielfeld {
    String[] field = {"Wert", "Hand"};

    public void anzeigenBenutzer(Karte[] args) {
        System.out.println("Benutzer:\n");
        for(Karte items : args){

            System.out.println(items.getBezeichnung());

        }

    }

    private void aktualisieren() {
    }
}