// Vehicle.java

public class Vehicle {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
            System.out.println("Hız negatif olamaz, 0 olarak ayarlandı.");
        }
    }

    public Vehicle() {
        System.out.println("Vehicle constructor'ı çalıştı!");
        this.speed = 0;
    }

    public void displayVehicleInfo() {
        System.out.println("Araç Hızı: " + this.speed + " km/s");
    }

    // Yeni metot: Aracın genel çalışma şekli
    public void start() {
        System.out.println("Araç motoru çalıştırıldı. (Vehicle start)");
    }
}