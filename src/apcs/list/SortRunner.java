package apcs.list;

public class SortRunner {
    public static void main(String[] args) {
        APCSList<Double> lst = new APCSList<Double>();
        for (int i=0; i<10; i++) {
            lst.add(Math.random());
        }
        System.out.println (lst);
        lst.sort();
        System.out.println (lst);
        Double val = lst.get (6);
        System.out.println ("Item 6 is : " + val);
        System.out.println (val + " is at index " + lst.binarySearch(val));

    }
}
