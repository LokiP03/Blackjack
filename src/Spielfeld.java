public class Spielfeld {
    String[] field = {"Wert", "Hand"};

    public void anzeigenBenutzer(String[] args) {
        System.out.println("Benutzer:\n");
        for(String items : args){

            System.out.println(items);

        }

    }

    private void aktualisieren() {
    }
}