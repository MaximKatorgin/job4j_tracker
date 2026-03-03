package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemDescByNameTest {

    @Test
    void whenCompareTo() {
        List<Item> items = new ArrayList<>();
        Item first = new Item("First");
        Item third = new Item("Third");
        Item second = new Item("Second");

        items.add(first);
        items.add(third);
        items.add(second);
        items.sort(new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(third);
        expected.add(second);
        expected.add(first);

        assertThat(items).isEqualTo(expected);
    }

}