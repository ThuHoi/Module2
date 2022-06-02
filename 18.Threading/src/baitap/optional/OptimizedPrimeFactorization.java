package baitap.optional;

public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        int count = 0, N = 2;
        while (count < 50) {

        }
    }

    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
