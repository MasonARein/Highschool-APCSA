package apcs.list;

import java.util.ArrayList;

public class APCSList<E> extends ArrayList<E> {
    public int indexOf (Object item) {
        return indexOfHelper(item, 0);
    }
    private int indexOfHelper (Object item, int loc) {
        if (loc >= this.size()) return -1;
        if (get(loc).equals(item)) return loc;
        return indexOfHelper (item, loc+1);
    }

}
