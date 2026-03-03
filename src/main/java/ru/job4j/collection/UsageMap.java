package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<>();
        emails.put("ivanov@mail.ru", "Ivanov Ivan");
        emails.put("petrov@mail.ru", "Petrov Petr");
        emails.put("antonov@mail.ru", "Antonov Anton");
        emails.put("petrov@mail.ru", "Petrov Ivan");
        emails.put("Sidorov@mail.ru", "Sidorov Anton");
        for (String key : emails.keySet()) {
            System.out.println(key + " : " + emails.get(key));
        }
    }
}
