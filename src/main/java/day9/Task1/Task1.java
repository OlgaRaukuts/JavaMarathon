package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Harry Potter","First A1");
        Teacher teacher = new Teacher("Minerva MacGonagal","Transfiguration");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
