package apcs.list;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class TimeRunner {
    public static void main(String[] args) {
        APCSList<Double> list = new APCSList<Double>();
        int n = 10000; // list size

        System.out.println("Warm-up...");

        for (int t=0; t<100; t++) {				// 100 times
            list = new APCSList<Double>();
            for (int i = 0; i < n; i++) {
                list.add(Math.random());
            }
            for (int i = 0; i < list.size(); i++) {
                Double v = list.get(i);
                list.indexOf(v);
                list.iterIndexOf(v);
                list.recurIndexOf(v);
            }
        }
        System.out.println("Timing...");

        System.out.println("i\tindexOf\trecur\titer");

        for (int i = 0; i < list.size(); i+=list.size()/100) {
            System.out.print(i + "\t");

            double v = list.get(i);

            long start = System.nanoTime();
            list.indexOf(v);
            long end = System.nanoTime();
            System.out.print((end-start) + "\t");

            start = System.nanoTime();
            list.recurIndexOf(v);
            end = System.nanoTime();
            System.out.print((end - start) + "\t");

            start = System.nanoTime();
            list.iterIndexOf(v);
            end = System.nanoTime();
            System.out.print(end - start);

            System.out.println();
        }
    }
}