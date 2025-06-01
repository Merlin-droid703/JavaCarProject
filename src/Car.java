// Car.java

public class Car extends Vehicle { // Vehicle sınıfından kalıtım alıyor

    private String brand;
    private String model;
    private int year;

    // Car sınıfı için Constructor
    public Car(String brand, String model, int year) {
        super(); // Üst sınıfın (Vehicle) constructor'ını çağırır
        System.out.println(brand + " " + model + " için Car constructor'ı çalıştı!");
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Car sınıfına özgü getter ve setter metotları
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

    // Vehicle sınıfındaki displayVehicleInfo metodunu override ediyoruz (ezme)
    @Override
    public void displayVehicleInfo() {
        System.out.println("--- Araba Detayları ---");
        System.out.println("Marka: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Yıl: " + this.year);
        // Miras alınan getSpeed() metodunu kullanarak hızı yazdırıyoruz
        System.out.println("Güncel Hız: " + getSpeed() + " km/s");
    }
}