// Person.java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        System.out.println("Person constructor'ı çağrıldı.");
        this.name = name;
        this.age = age;
    }

    // BU METOTLARIN DOĞRU TANIMLANDIĞINDAN EMİN OL:
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    // ---------------------------------------------

    public void displayPersonInfo() {
        System.out.println("İsim: " + this.name + ", Yaş: " + this.age);
    }
}