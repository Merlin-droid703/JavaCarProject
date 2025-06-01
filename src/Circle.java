// Circle.java
public class Circle extends Shape { // Shape soyut sınıfından kalıtım alıyor

    @Override // Shape sınıfındaki abstract draw() metodunu override ediyoruz
    public void draw() {
        System.out.println("Bir daire çiziliyor: O");
    }
}
