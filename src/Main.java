public class Main {
    public static void main(String[] args) {
        Firma bäckerei = new Firma("Brötchen");
        // bäckerei.waren = "Falschgeld"; <- das geht nicht mehr! weil "private"
        System.out.println("Was produziert die Bäckerei? " + bäckerei.getWaren());
        bäckerei.setWaren("Falschgeld");
        bäckerei.produzieren();
    }
}
