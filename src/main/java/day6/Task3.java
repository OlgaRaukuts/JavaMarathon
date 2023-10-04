package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Severus Snape","Potions");
        Student student = new Student("Harry Potter");
        teacher.evaluate(student);
    }
}
