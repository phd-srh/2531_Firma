public class Firma {
    public String waren;

    public Firma(String waren) {
        this.waren = waren;
    }

    public void produzieren() {
        System.out.println("Die Firma produziert " + this.waren);
    }
}
