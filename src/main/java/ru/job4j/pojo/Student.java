package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;
    private String group;
    private LocalDate enroll;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getEnroll() {
        return enroll;
    }

    public void setEnroll(int year, int month, int dayOfMonth) {
        this.enroll = LocalDate.of(year, month, dayOfMonth);
    }
}
