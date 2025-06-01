// MainUygulama.java

public class MainUygulama {

    public static void main(String[] args) {
        System.out.println("MainUygulama (Kalıtım Testi) çalışmaya başladı...");
        System.out.println();

        // 1. Bir Car nesnesi oluştur.
        // Bu işlem sırasında hem Vehicle hem de Car constructor'ları çalışacak.
        Car myCar = new Car("Toyota", "Supra", 2024);
        System.out.println();

        // 2. 'speed' değerini ata (Vehicle'dan miras alınan setSpeed metodu ile).
        System.out.println("Arabanın hızı ayarlanıyor...");
        myCar.setSpeed(180.5);
        System.out.println();

        // 3. 'speed' değerini ve diğer bilgileri ekrana yazdır.
        System.out.println("--- 'get' Metotları ile Alınan Bilgiler ---");
        System.out.println("Marka: " + myCar.getBrand()); // Car'a özgü
        System.out.println("Model: " + myCar.getModel()); // Car'a özgü
        System.out.println("Yıl: " + myCar.getYear());   // Car'a özgü
        System.out.println("Arabanın Hızı: " + myCar.getSpeed() + " km/s"); // Vehicle'dan miras alındı
        System.out.println();

        // Car sınıfındaki override edilmiş displayVehicleInfo metodunu çağıralım
        myCar.displayVehicleInfo();

        System.out.println();
        System.out.println("MainUygulama (Kalıtım Testi) tamamlandı.");
    }
}