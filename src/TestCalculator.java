// TestCalculator.java
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // İki parametreli add metodunu çağırma
        int sumOfTwo = calculator.add(10, 20);
        System.out.println("10 + 20 = " + sumOfTwo);
        System.out.println();

        // Üç parametreli add metodunu çağırma
        int sumOfThree = calculator.add(5, 15, 25);
        System.out.println("5 + 15 + 25 = " + sumOfThree);
        System.out.println();

        // Örnek: Eğer double parametreli add metodu da olsaydı:
        // double sumOfTwoDoubles = calculator.add(3.5, 2.5);
        // System.out.println("3.5 + 2.5 = " + sumOfTwoDoubles);
    }
}