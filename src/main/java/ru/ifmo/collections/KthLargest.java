package ru.ifmo.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/**
 * Design a class to find the kth largest element in a stream. k is from 1 to numbers.length.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Constructor accepts an integer k and an integer array numbers, which contains initial elements from the stream.
 * For each call to the method KthLargest.add(), return the element representing the kth largest element in the stream.
 */
public class KthLargest {

    List<Integer> list = new ArrayList<>();
    int index;

    public KthLargest(int k, int[] numbers) {
        this.index = k;
        for (int item : numbers) {
            this.add(item);
        }
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return (list.size() > index) ? list.get(list.size() - index) : 0;
    }
}