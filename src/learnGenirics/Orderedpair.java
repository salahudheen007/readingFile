package learnGenirics;

public class Orderedpair <K,V>{
    private K key;
    private  V value;


    public Orderedpair(K key,V value){
        this.key=key;
        this.value=value;

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
