// MainUygulama.java

public class MainUygulama {

    public static void main(String[] args) {
        System.out.println("MainUygulama (Override Testi) çalışmaya başladı...");
        System.out.println();

        // Bir Car nesnesi oluştur.
        Car myCar = new Car("Toyota", "Supra", 2024);
        System.out.println();

        // Car nesnesi için start() metodunu çağır.
        // Car sınıfındaki override edilmiş start() metodu çalışacak.
        myCar.start();
        System.out.println();

        myCar.setSpeed(60);
        myCar.displayVehicleInfo(); // Diğer bilgileri de görelim

        System.out.println();

        // Karşılaştırma için bir Vehicle nesnesi de oluşturabiliriz (isteğe bağlı)
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start(); // Bu, Vehicle sınıfındaki orijinal start() metodunu çağırır.


        System.out.println();
        System.out.println("MainUygulama (Override Testi) tamamlandı.");
    }
}