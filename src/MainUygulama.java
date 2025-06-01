// MainUygulama.java dosyası

public class MainUygulama {

    public static void main(String[] args) {
        System.out.println("MainUygulama çalışmaya başladı...");
        System.out.println();

        // 1. Görev ve 2. Görev birleştirilmiş:
        // Car sınıfından nesneler oluşturulurken constructor kullanılıyor.

        // İlk araba nesnesini oluşturma
        Car araba1 = new Car("Toyota", "Corolla", 2023);

        // İkinci araba nesnesini oluşturma
        Car araba2 = new Car("Ford", "Mustang", 2024);
        Car araba3 = new Car("Honda", "Civic", 2022);

        System.out.println(); // Çıktıda boşluk bırakmak için

        // Oluşturulan nesnelerin bilgilerini ekrana yazdırma
        System.out.println("İlk Araba:");
        araba1.displayInfo();

        System.out.println(); // Çıktıda boşluk bırakmak için

        System.out.println("İkinci Araba:");
        araba2.displayInfo();

        System.out.println(); // Çıktıda boşluk bırakmak için

        System.out.println("Üçüncü Araba:");
        araba3.displayInfo();

        System.out.println();
        System.out.println("MainUygulama tamamlandı.");
    }
}
