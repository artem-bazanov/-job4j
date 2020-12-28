package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Артем Базанов");
        student.setGroup("1-РИ2020");
        student.setAdmission(new Date());

        System.out.println("Student name - " + student.getName() + System.lineSeparator() +
                "Group - " + student.getGroup() + System.lineSeparator() +
                "Receipt date - " + student.getAdmission());
    }
}
