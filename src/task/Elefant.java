package task;

public class Elefant extends Erbivor implements Animal {

    @Override
    public void mananca() {
        System.out.println("Elefantul mananca");
    }

    @Override
    public void doarme() {
        System.out.println("Elefantul doarme");
    }

    @Override
    public void spalare() {
        System.out.println("Elefantul se balaceste in apa");
    }

    public void hraneste() {
        System.out.println("Elefantul se hraneste cu plante");
    }
    public static void main(String[] args) {
        Elefant elefant = new Elefant();

        elefant.mananca();
        elefant.doarme();
        elefant.spalare();

        Animal.descriere();

        Elefant elefantIerbivor = new Elefant();

        elefantIerbivor.hraneste();
        elefantIerbivor.diferentiaza();
    }

}
