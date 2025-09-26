public class Main {
    public static void main(String[] args) {
        Bok b1 = new Bok();
        b1.vis();

        b1.setTittel("Java");
        b1.setForfatter("Olsen");
        b1.setUAar(2022);
        b1.setPris(399.50);
        b1.vis();
        System.out.println();

        // Skrive ut berre titel
        String t = b1.getTittel();
        System.out.println(t);  // kunne brukt kallet direkte
        // Vil ha med fornavn på forfatter
        b1.setForfatter("Olsen, Ole");
        b1.vis();

        Bok b2 = new Bok("Java 2", "Kristensen, Lars", 2024, 350);
        b2.vis();

        // Hva koster begge bøkene til sammen?
        double totalpris = b1.getPris() + b2.getPris();
        System.out.println("Totalpris: " + totalpris);

        System.out.println("\nEldste boka:");
        Bok b3 = b1.eldst(b2);
        b3.vis();
    }
}
