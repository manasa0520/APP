package Week6;
public class Person {
    private String name_010;
    private int age_010;

    public Person(String name_010, int age_010) {
        this.name_010 = name_010;
        this.age_010 = age_010;
    }

    public String getName_010() {
        return name_010;
    }

    public int getAge_010() {
        return age_010;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Manasa", 18);
        Person person2 = new Person("Saakshie", 8);

        System.out.println("Person 1 - Name: " + person1.getName_010() + ", Age: " + person1.getAge_010());
        System.out.println("Person 2 - Name: " + person2.getName_010() + ", Age: " + person2.getAge_010());
    }
}
