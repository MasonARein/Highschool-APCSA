package apcs.list;

import java.util.ArrayList;
import java.util.Collections;

public class APCSList<E extends Comparable<E>> extends ArrayList<E> {

    public int recurIndexOf (E item) {
        return recurIndexOfHelper(item, 0);
    }

    private int recurIndexOfHelper (E item, int loc) {
        if (loc >= this.size()) return -1;
        if (get(loc).equals(item)) return loc;
        return recurIndexOfHelper (item, loc+1);
    }
    public int iterIndexOf ( E item){
        if (0 >= this.size()) return -1;
        for(int a = 0; a < this.size();a++){
            if(get(a).equals(item))return a;
        }
        return -1;
    }
    public void sort() {
        Collections.sort(this);
    }
    public void quickSort(){
        APCSList<E> done = new APCSList<E>();
        APCSList<E> more = new APCSList<E>();
        APCSList<E> less = new APCSList<E>();
                int pivot = (int)(this.size() * Math.random());
                if(this.size() <= 1){
                    return;
                }
                else{
                    for(int a = 0; a < this.size(); a++){
                        if(this.get(a).compareTo(this.get(pivot)) > 0){
                            more.add(this.get(a));
                        }
                        else if(this.get(a).compareTo(this.get(pivot)) < 0){
                            less.add(this.get(a));
                        }
                        else{
                            done.add(this.get(a));
                        }
                    }
                    this.clear();
                    less.quickSort();
                    more.quickSort();

                    less.addAll(done);
                    less.addAll(more);
                }
    }
    public int binarySearch(E value){
        int left = 0;
        int right = this.size() - 1;
        while (left <= right){
            int midpoint = ((left + right) / 2);
            if (this.get(midpoint).compareTo(value) == 0){
                return midpoint;
            } else if (this.get(midpoint).compareTo(value) < 0){
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return - 1;

    }
}
