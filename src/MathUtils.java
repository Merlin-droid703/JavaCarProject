// MathUtils.java
public class MathUtils {

    // İki sayıyı çarpan static metot
    // Bu metot MathUtils sınıfına aittir, bir MathUtils nesnesine değil.
    public static int multiply(int a, int b) {
        System.out.println("MathUtils.multiply static metodu çağrıldı.");
        return a * b;
    }

    // Static olmayan bir metot örneği (karşılaştırma için):
    // public int add(int a, int b) {
    //     return a + b; // Bu metodu çağırmak için MathUtils nesnesi gerekir.
    // }
}
