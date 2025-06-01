// TestAbstractClasses.java
public class TestAbstractClasses {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // HATA! Soyut sınıftan doğrudan nesne oluşturulamaz.

        Shape daire = new Circle();      // Shape referansı, Circle nesnesini tutabilir.
        Shape dikdortgen = new Rectangle(); // Shape referansı, Rectangle nesnesini tutabilir.

        System.out.println("Daire çiziliyor:");
        daire.draw();         // Circle sınıfındaki draw() metodu çağrılır.
        daire.getInfo();      // Shape sınıfındaki somut metot çağrılır.
        System.out.println();

        System.out.println("Dikdörtgen çiziliyor:");
        dikdortgen.draw();    // Rectangle sınıfındaki draw() metodu çağrılır.
        dikdortgen.getInfo(); // Shape sınıfındaki somut metot çağrılır.
    }
}
