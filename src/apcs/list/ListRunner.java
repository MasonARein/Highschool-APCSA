package apcs.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRunner {
    public static void main(String[] args) {
        APCSList<Double> list = new APCSList<Double> ();
        for (int i = 0; i < 20; i++) {
            list.add(Math.random());
        }
        System.out.println("The list is:\n" + list);

        int rand = (int)(Math.random()*list.size());
        Double val = list.get(rand);

        System.out.println ("Item " + rand + " is " + val);

        int loc = list.indexOf (val);
        System.out.println ("The index of " + val + " using ArrayList's indexOf is " + loc);
        loc = list.recurIndexOf (val);
        System.out.println ("The index of " + val + " using recurIndexOf is " + loc);
        loc = list.iterIndexOf (val);
        System.out.println ("The index of " + val + " using iterIndexOf is " + loc);
    }
}

