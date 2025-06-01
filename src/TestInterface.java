// TestInterface.java
public class TestInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.print("Köpek diyor ki: ");
        myDog.sound(); // Hatanın olduğu satır (yaklaşık)

        System.out.print("Kedi diyor ki: ");
        myCat.sound();

        // ... (kodun geri kalanı)
    }
}