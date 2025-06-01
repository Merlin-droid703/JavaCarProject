// TestStaticMethod.java
public class TestStaticMethod {
    public static void main(String[] args) {
        // MathUtils sınıfından bir nesne OLUŞTURMADAN static metodu çağırıyoruz.
        // Doğrudan SınıfAdı.metotAdı() şeklinde kullanılır.
        int sayi1 = 8;
        int sayi2 = 7;
        int carpimSonucu = MathUtils.multiply(sayi1, sayi2);

        System.out.println(sayi1 + " * " + sayi2 + " = " + carpimSonucu);

        // Karşılaştırma: Eğer multiply static olmasaydı şöyle yapmamız gerekirdi:
        // MathUtils utilsNesnesi = new MathUtils();
        // int sonuc = utilsNesnesi.multiply(sayi1, sayi2); // Nesne üzerinden çağrı
    }
}
