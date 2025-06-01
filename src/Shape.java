// Shape.java
public abstract class Shape { // 'abstract' anahtar kelimesi sınıfın soyut olduğunu belirtir

    // Soyut metot: Gövdesi yoktur, sadece imzası vardır.
    // Bu metot, Shape sınıfından türeyen her alt sınıf tarafından ZORUNLU olarak
    // override edilmek (yeniden yazılmak) zorundadır.
    public abstract void draw();

    // Soyut sınıflar, soyut olmayan (concrete) metotlar da içerebilir.
    public void getInfo() {
        System.out.println("Bu bir geometrik şekildir.");
    }
}
