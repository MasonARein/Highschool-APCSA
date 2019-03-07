package apcs.list;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] argv) {
        double[] arr = new double[20];
        for (int a = 0; a < 20; a++) {
            arr[a] = Math.random();
        }
        System.out.println(Arrays.toString(arr));
        int val = (int) (Math.random() * 20);
        System.out.println("Item " + val + " is " + arr[val]);
        double vala = arr[(int) (Math.random() * 20)];
        int loc = indexOf(arr, vala, 2);
        System.out.println("The index of " + vala + " is " + loc);
        double valb = -1.0;
        int locb = indexOf(arr, valb);
        System.out.println("The index of " + valb + " is " + locb);


    }

    public static int indexOf(double[] arr, double val) {
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == val) {
                return b;
            }
        }
        return -1;
    }

    public static int indexOf(double[] arr, double val, int loc) {
        if (loc >= arr.length) return -1;
        if (arr[loc] == val) return loc;
        else{
            return indexOf(arr, val, loc + 1);
        }
    }
}
