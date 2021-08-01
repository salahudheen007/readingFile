package learnGenirics;

public class Tetsppair {


    public static void main(String[] args) {
        Orderedpair<String,Integer> mypair=new Orderedpair("hello",56);
        Orderedpair<Integer,Orderedpair> mypar1=new Orderedpair<>(1,new Orderedpair("world",10));
        System.out.println(mypair.getKey());
        System.out.println(mypair.getValue());
        System.out.println(mypar1.getValue());
        System.out.println(mypar1.getKey());


    }
}
