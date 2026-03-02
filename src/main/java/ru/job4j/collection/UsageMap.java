package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<>();
        emails.put("ivanov@mail.ru", "Ivanov Ivan");
        emails.put("petrov@mail.ru", "Petrov Petr");
        for (String key : emails.keySet()) {
            System.out.println(key + " : " + emails.get(key));
        }
    }
}
