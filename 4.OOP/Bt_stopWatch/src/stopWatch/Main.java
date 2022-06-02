package stopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        long[] array = new long[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 100);
        }
        LocalTime start = LocalTime.now();
        StopWatch.selectSort(array);
        LocalTime stop = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, stop);
        System.out.println(stopWatch.getElapsedTime());
    }
}
