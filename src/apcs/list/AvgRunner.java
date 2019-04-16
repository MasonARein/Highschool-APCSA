package apcs.list;

public class AvgRunner {
    public static void main(String[] args) {
        APCSList<Double> list = new APCSList<Double>();
        System.out.println("Warm-up...");

        for (int t = 0; t < 100; t++) {                // 100 times
            list = new APCSList<Double>();
            for (int i = 0; i < 100; i++) {
                list.add(Math.random());
            }
            for (int i = 0; i < list.size(); i++) {
                Double v = list.get(i);
                list.indexOf(v);
                list.iterIndexOf(v);
                list.recurIndexOf(v);
                list.binarySearch(v);
            }
        }
        System.out.println("Timing...");

        System.out.println("n\tindexOf\trecur\titer\tbinary");
        for (int n = 1000; n <= 10000; n += 500) {
            long totala = 0;
            long totalb = 0;
            long totalc = 0;
            long totald = 0;
            list = new APCSList<Double>();
            for (int i = 0; i < n; i++) {
                list.add(Math.random());
            }
            list.sort();

            for (int i = 0; i < list.size(); i ++) {

                double v = list.get(i);

                long start = System.nanoTime();
                list.indexOf(v);
                long end = System.nanoTime();
                totala = totala + (end -start);


                start = System.nanoTime();
                list.recurIndexOf(v);
                end = System.nanoTime();
                totalb = totalb + (end - start);


                start = System.nanoTime();
                list.iterIndexOf(v);
                end = System.nanoTime();
                totalc = totalc + (end - start);

                start = System.nanoTime();
                list.binarySearch(v);
                end = System.nanoTime();
                totald = totald + (end - start);

            }
            System.out.print(list.size() + "\t");
            long average = totala / list.size();
            System.out.print(average + "\t");
            average = totalb / list.size();
            System.out.print(average + "\t");
            average = totalc / list.size();
            System.out.print(average + "\t");
            average = totald / list.size();
            System.out.print(average + "\t");
            System.out.println();
        }
    }

}
