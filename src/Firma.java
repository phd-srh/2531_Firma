public class Firma {
    private String waren;

    public Firma(String waren) {
        this.waren = waren;
    }

    // standard Getter für das Attribut "waren"
    public String getWaren() {
        return this.waren;
    }

    // standard Setter für das Attribut "waren"
    public void setWaren(String waren) {
        if (waren.equals("Falschgeld") || waren.equals("Waffen") ||
            waren.equals("Drogen"))
            return; // <- early exit, wir tun das folgende nicht !
        this.waren = waren;
    }

    public void produzieren() {
        System.out.println("Die Firma produziert " + this.waren);
    }
}
