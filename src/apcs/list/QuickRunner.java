package apcs.list;

public class QuickRunner {
    public static void main(String[] args) {
        APCSList<Double> list = new APCSList<Double>();
        System.out.println("Warm-up...");
        for (int t = 0; t < 50; t++) {                // 100 times
            list = new APCSList<Double>();
            for (int i = 0; i < 10000; i++) {
                list.add(Math.random());
            }
            list.quickSort();
            list = new APCSList<Double>();
            for (int i = 0; i < 10000; i++) {
                list.add(Math.random());
            }
            list.sort();
        }
        System.out.println("Timing...");
        for (int n = 1000; n <= 10000; n += 500) {
            long totala = 0;
            long totalb = 0;
            list = new APCSList<Double>();
            for (int i = 0; i < n; i++) {
                list.add(Math.random());
            }
            long start = System.nanoTime();
            list.sort();
            long end = System.nanoTime();
            totala = totala + (end -start);
            list = new APCSList<Double>();
            for (int i = 0; i < n; i++) {
                list.add(Math.random());
            }
             start = System.nanoTime();
            list.quickSort();
             end = System.nanoTime();
            totalb = totalb + (end -start);
            System.out.print(n + "\t");
            long average = totala;
            System.out.print(average + "\t");
            average = totalb;
            System.out.print(average + "\t");
            System.out.println();
        }
    }
}
