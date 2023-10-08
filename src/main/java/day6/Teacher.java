package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String grade;
    public void evaluate(Student student){
        Random random = new Random();
        int num = random.nextInt(5 - 2) + 2;
        if(num==5){
            grade = "Oтлично";
        }else if(num==4){
           grade = "ХОРОШО";
        }else if (num==3){
            grade = "УДОВЛЕТВОРИТЕЛЬНО";
        }else {
            grade = "НЕУДОВЛЕТВОРИТЕЛЬНО";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +  " по предмету " + subject + " на оценку " + grade);
    }

}


