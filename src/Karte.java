public class Karte {
    private int wert ;
    private String bezeichnung;
    public Karte(int wert,String bezeichnung) {
        this.wert = wert;
        this.bezeichnung = bezeichnung;

    }
    public String getBezeichnung() {
        return this.bezeichnung;
    }
    public int getWert() {
        return this.wert;
    }
}
