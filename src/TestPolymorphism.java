// TestPolymorphism.java
public class TestPolymorphism {
    public static void main(String[] args) {
        // Animal türünde bir referans, Cat nesnesini işaret ediyor.
        Animal animal1 = new Cat();

        // Animal türünde bir referans, Dog nesnesini işaret ediyor.
        Animal animal2 = new Dog();

        System.out.println("animal1 (bir Kedi) ses çıkarıyor:");
        animal1.makeSound(); // Cat sınıfındaki makeSound() çağrılacak

        System.out.println("\nanimal2 (bir Köpek) ses çıkarıyor:");
        animal2.makeSound(); // Dog sınıfındaki makeSound() çağrılacak

        System.out.println("\n--- Ekstra Örnek: Dizide Kullanım ---");
        Animal[] hayvanlar = new Animal[3];
        hayvanlar[0] = new Dog();
        hayvanlar[1] = new Cat();
        hayvanlar[2] = new Animal(); // Genel Animal nesnesi

        for (Animal hayvan : hayvanlar) {
            hayvan.makeSound();
        }
    }
}