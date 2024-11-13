package task;

public interface Animal {

    void mananca();
    void doarme();

    default void spalare() {
        System.out.println("Animalul se spala");
    }

    static void descriere() {
        System.out.println("Animalele sunt jucause");
    }
}
