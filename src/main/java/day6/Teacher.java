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

    public void evaluate(Student student){
        int num = random(2,5);
        if(num==5){
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +  " по предмету " + subject + "на оценку " + num + " ОТЛИЧНО");
        }else if(num==4){
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + "на оценку " + num + " ХОРОШО");
        }else if (num==3){
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +  " по предмету " + subject + "на оценку " + num + " УДОВЛЕТВОРИТЕЛЬНО");
        }else {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + "на оценку " + num + " НЕУДОВЛЕТВОРИТЕЛЬНО");
        }
    }

    public int random(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt(max - min) + min;
        return randomNum;
    }
}


