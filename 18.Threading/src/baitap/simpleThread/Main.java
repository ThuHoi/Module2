package baitap.simpleThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator1 numberGenerator1 = new NumberGenerator1();
        NumberGenerator2 numberGenerator2 = new NumberGenerator2();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.start();
        thread2.start();

    }
}
