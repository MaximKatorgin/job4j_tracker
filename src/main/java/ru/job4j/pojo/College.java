package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan");
        student.setGroup("12B-54");
        student.setEnroll(2025, 9, 1);

        System.out.println(student.getFio() + " is enrolled " +  student.getEnroll() + " in group " + student.getGroup());
    }
}
