package baitap.oddthread;

public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Chẵn" + i);
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
