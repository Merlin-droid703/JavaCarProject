// TestThisSuper.java
public class TestThisSuper {
    public static void main(String[] args) {
        System.out.println("Student nesnesi oluşturuluyor...");
        Student student1 = new Student("Ayşe Yılmaz", 20, "S12345");
        System.out.println();

        System.out.println("Öğrenci Bilgileri:");
        student1.displayPersonInfo(); // Student sınıfındaki override edilmiş metot çağrılacak

        System.out.println("\nGetter ile erişim:");
        System.out.println("Ad: " + student1.getName()); // Person'dan miras
        System.out.println("Yaş: " + student1.getAge());   // Person'dan miras
        System.out.println("ID: " + student1.getStudentId()); // Student'a özgü
    }
}
