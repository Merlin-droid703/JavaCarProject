// Vehicle.java

public class Vehicle {
    private double speed; // Hız özelliği, kapsülleme için private

    // speed için getter metodu
    public double getSpeed() {
        return speed;
    }

    // speed için setter metodu
    public void setSpeed(double speed) { // Metot burada başlıyor
        if (speed >= 0) { // Hız negatif olamaz gibi basit bir kontrol
            this.speed = speed;
        } else {
            this.speed = 0;
            System.out.println("Hız negatif olamaz, 0 olarak ayarlandı.");
        }
    } // <<<<<<< EKSİK OLAN KAPANAN SÜSLÜ PARANTEZ BU SATIRDA OLMALI

    // Vehicle sınıfı için bir constructor
    public Vehicle() {
        System.out.println("Vehicle constructor'ı çalıştı!");
        this.speed = 0; // Varsayılan hız
    }

    public void displayVehicleInfo() {
        System.out.println("Araç Hızı: " + this.speed + " km/s");
    }
}