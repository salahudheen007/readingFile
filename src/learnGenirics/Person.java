package learnGenirics;

public class Person<T> {
    private T name;

    public void add(T name) {
        this.name = name;
    }
    public T get(){
        return name;
    }

}
