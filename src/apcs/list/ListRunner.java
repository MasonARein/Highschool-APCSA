package apcs.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRunner {
    public static void main(String[] argv) {
        ArrayList<Double> list = new APCSList<Double> ();
        for (int i = 0; i < 20; i++) {
            list.add(Math.random());
        }

        System.out.println(list.toString());
        int val = (int) (Math.random() * 20);
        System.out.println("Item " + val + " is " + list.get(val));
        double vala = list.get((int) (Math.random() * 20));
        int loc = list.indexOf(vala);
        System.out.println("The index of " + vala + " is " + loc);
        double valb = -1.0;
        int locb = list.indexOf(valb);
        System.out.println("The index of " + valb + " is " + locb);
    }
    public static int indexOf(ArrayList<Double> arr, double val, int loc) {
        if (loc >= arr.size()) return -1;
        if (arr.get(loc) == val) return loc;
        else{
            return indexOf(arr, val, loc + 1);
        }
    }
}
