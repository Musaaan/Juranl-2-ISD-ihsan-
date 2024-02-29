import java.util.ArrayList;
import java.util.Collections;

public class Generic<E> {
    private final ArrayList<E> list;

    public Generic(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 0;
        list = new ArrayList<>(initCapacity);
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            System.out.printf(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(E entry) {
        list.remove(entry);
    }

    public void setData(E object1, E object2) {
        int index = list.indexOf(object1);
        list.add(index, object2);
    }
}