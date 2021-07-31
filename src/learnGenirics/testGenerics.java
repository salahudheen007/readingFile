package learnGenirics;

public class testGenerics {
    public static void main(String[] args) {
        Person<String> person=new Person<>();
        person.add("salah");
        System.out.println(person.get());
        Person<Integer> age=new Person<>();
        age.add(20);
        System.out.println(age.get());
    }
}
