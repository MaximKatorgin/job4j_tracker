package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String shortest = o1.length() < o2.length() ? o1 : o2;
        for (int i = 0; i < shortest.length(); i++) {
            int charCompare = Character.compare(o1.charAt(i), o2.charAt(i));
            if (charCompare != 0) {
                return charCompare;
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}
