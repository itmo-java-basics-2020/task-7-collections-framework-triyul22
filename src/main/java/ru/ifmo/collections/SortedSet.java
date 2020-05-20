package ru.ifmo.collections;

import java.util.*;

/**
 * Represents sorted set of unique values.
 * create() returns a SortedSet instance with natural ordering. (i.e. from smallest to largest in case of integer numbers)
 * from() is used to create a SortedSet instance with given Comparator.
 * Instances of a class can be created using only these two methods above.
 * <p>
 * This class should not be abstract and should be capable of adding/removing single/multiple elements.
 * It has two more methods: getSorted() and getReversed() which return an array of set contents in forward and reverse order respectively.
 * <p>
 * NB! This class must have only map(s) as an internal data structure(s).
 *
 * @param <T> set contents type
 */
public class SortedSet<T> extends AbstractSet<T> {

    private final Map<T, Boolean> helperMap;

    private SortedSet(TreeMap<T, Boolean> map) {
        this.helperMap = map;
    }

    public static <T> SortedSet<T> create() {
        return new SortedSet<>(new TreeMap<>());
    }

    public static <T> SortedSet<T> from(Comparator<T> comparator) {
        return new SortedSet<>(new TreeMap<>(comparator));
    }

    public List<T> getSorted() {
        return new ArrayList<>(helperMap.keySet());
    }

    public List<T> getReversed() {
        ArrayList<T> list = new ArrayList<>(helperMap.keySet());
        Collections.reverse(list);
        return list;
    }

    public boolean add(T param) {
        return helperMap.put(param, true) == null;
    }

    @Override
    public Iterator<T> iterator() {
        return helperMap.keySet().iterator();
    }

    @Override
    public int size() {
        return helperMap.size();
    }
}
