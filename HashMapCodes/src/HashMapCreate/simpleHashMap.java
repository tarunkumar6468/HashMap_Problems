package HashMapCreate;

import java.util.ArrayList;
import java.util.List;

public class simpleHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private List<Entry<K, V>>[] buckets;

    public simpleHashMap() {
        buckets = new ArrayList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        simpleHashMap<String, Integer> map = new simpleHashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 15);

        System.out.println("Number of apples: " + map.get("apple"));
        System.out.println("Number of bananas: " + map.get("banana"));
        System.out.println("Number of oranges: " + map.get("orange"));
    }
}
