package ru.ifmo.collections;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private List<Integer> list = new ArrayList<>();

    public FirstUnique(int[] numbers) {
        for (int num : numbers) {
            this.add(num);
        }
    }

    public int showFirstUnique() {
        for (Integer item : this.list) {
            if (Collections.frequency(list, item) == 1) {
                return item;
            }
        }
        return -1;
    }

    public void add(int value) {
        this.list.add(value);
    }
}
