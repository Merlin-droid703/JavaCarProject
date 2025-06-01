// Car.java

public class Car extends Vehicle {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        super();
        System.out.println(brand + " " + model + " için Car constructor'ı çalıştı!");
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("--- Araba Detayları ---");
        System.out.println("Marka: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Yıl: " + this.year);
        System.out.println("Güncel Hız: " + getSpeed() + " km/s");
    }

    // Vehicle sınıfındaki start() metodunu override ediyoruz
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " arabasının motoru çalıştırıldı. (Car start)");
        // İsteğe bağlı: Üst sınıfın start() metodunu da çağırabiliriz:
        // super.start(); // Bu satır "Araç motoru çalıştırıldı. (Vehicle start)" mesajını da yazdırır.
    }
}