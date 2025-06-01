// Student.java
public class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        // 'super(name, age);' çağrısı, üst sınıfın (Person) constructor'ını çağırır.
        // Bu, alt sınıf constructor'ındaki İLK satır olmalıdır.
        super(name, age);
        System.out.println("Student constructor'ı çağrıldı.");

        // 'this' anahtar kelimesi, Student sınıfının kendi alanı olan 'studentId'yi
        // constructor parametresinden ayırmak için kullanılır.
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    // Üst sınıftaki metodu override edip ek bilgi ekleyebiliriz
    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo(); // Üst sınıfın metodunu çağırır
        System.out.println("Öğrenci ID: " + this.studentId);
    }
}