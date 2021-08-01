package learnGenirics;

import java.util.ArrayList;

public class Person<T> {
    private T name;
    private ArrayList<T> list = new ArrayList<>();

    public void add(T name) {
        list.add(name);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }

}
