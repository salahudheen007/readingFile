package learnGenirics;

public class testGenerics {
    public static void main(String[] args) {
        Person<String> person = new Person<>();
        person.add("salah");
        System.out.println(person.get(0));
        Person<Integer> age = new Person<>();
        age.add(20);
        System.out.println(age.get(0));
        age.add(50);
        System.out.println(age.size());
    }
}
