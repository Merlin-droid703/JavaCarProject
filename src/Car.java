/*
Konu: Class & Object
Java'da sınıf, bir nesnenin şablonudur. Nesne ise bu şablona göre oluşturulan canlı örnektir.

Görev:
-   Car adında bir sınıf oluşturun.
-   Markası, modeli ve yılı gibi özellikler ekleyin.
-   main metodunda bir Car nesnesi oluşturup bilgileri ekrana yazdırın.
*/

// YUKARIDAKI YORUM BLOĞUNDAN SONRA SADECE BİR TANE SINIF TANIMI OLMALI
public class Car {

    // Özellikler (Attributes / Fields)
    String brand;
    String model;
    int year;

    // Kurucu Metot (Constructor)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Bilgileri Görüntüleme Metodu
    public void displayInfo() {
        System.out.println("--- Araba Bilgileri ---");
        System.out.println("Marka: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Yıl: " + this.year);
    }

    // Main Metot (Programın başlangıç noktası)
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2023);
        Car anotherCar = new Car("Ford", "Focus", 2022);

        System.out.println("İlk Arabanın Bilgileri (Doğrudan Erişim):");
        System.out.println("Marka: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Yıl: " + myCar.year);
        System.out.println();

        System.out.println("İkinci Arabanın Bilgileri (Metot ile Erişim):");
        anotherCar.displayInfo();
    }
}
