// Calculator.java
public class Calculator {

    // İki tamsayı toplayan metot
    public int add(int a, int b) {
        System.out.println("İki parametreli add metodu çağrıldı.");
        return a + b;
    }

    // Üç tamsayı toplayan metot (aşırı yüklenmiş)
    public int add(int a, int b, int c) {
        System.out.println("Üç parametreli add metodu çağrıldı.");
        return a + b + c;
    }

    // Örnek olarak double türleriyle de aşırı yükleme yapılabilir:
    // public double add(double a, double b) {
    //     System.out.println("İki double parametreli add metodu çağrıldı.");
    //     return a + b;
    // }
}