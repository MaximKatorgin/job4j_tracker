package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {
        List<String> result = new ArrayList<>();
        Set<String> temp = new LinkedHashSet<>();
        for (String department : departments) {
            String start = "";
            for (String element : department.split("/")) {
                if (start.isEmpty()) {
                    start = element;
                } else {
                    start = start + "/" + element;
                }
                temp.add(start);
            }
        }
        result.addAll(temp);
        return result;
    }

    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> departments) {
        departments.sort(new DepDescComp());
    }
}
