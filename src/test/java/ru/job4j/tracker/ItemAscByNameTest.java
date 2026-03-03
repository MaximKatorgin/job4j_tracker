package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ItemAscByNameTest {

    @Test
    void whenCompareTo() {
        List<Item> items = new ArrayList<>();
        Item first = new Item("First");
        Item third = new Item("Third");
        Item second = new Item("Second");

        items.add(first);
        items.add(third);
        items.add(second);
        items.sort(new ItemAscByName());

        List<Item> expected = new ArrayList<>();
        expected.add(first);
        expected.add(second);
        expected.add(third);

        assertThat(items).isEqualTo(expected);
    }

}