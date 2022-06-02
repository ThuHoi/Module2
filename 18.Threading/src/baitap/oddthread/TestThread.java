package baitap.oddthread;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        try {
            evenThread.start();
            evenThread.join();
            oddThread.start();
        } catch (InterruptedException oe) {
            System.err.println(oe.getMessage());
        }


    }
}
