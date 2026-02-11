package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String name) {
        Item[] result = new Item[size];
        int resultSize = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(name)) {
                result[resultSize++] = items[i];
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public boolean replace(int id, Item item) {
        int indexForReplacement = indexOf(id);
        if (indexForReplacement == -1) {
            return false;
        }
        item.setId(items[indexForReplacement].getId());
        items[indexForReplacement] = item;
        return true;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return;
        }
        int start = index + 1;
        int length = size - index - 1;
        System.arraycopy(items, start,  items, index, length);
        items[size - 1] = null;
        size--;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}