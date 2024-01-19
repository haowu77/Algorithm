package cool.wuhao;

import java.util.LinkedList;

public class HashMap<K, V> {

    private static final int DEFAULT_CAPCITY = 3;
    private LinkedList<Entry<K, V>>[] buckets;

    public class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap() {
        this.buckets = new LinkedList[DEFAULT_CAPCITY];
    }

    public void put(K key, V value) {
        int index = hash(key);
        System.out.println("index: " + index);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        if (buckets[index] == null) {
            return null;
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private int hash(K key) {
        int hashCode = key.hashCode();
        int length = buckets.length;
//        System.out.println("hashcode: " + hashCode + " length: " + length + " hashCode%length: " + hashCode % length);
        return hashCode % length;
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put("3", "3");
        hashMap.put("4", "4");
        System.out.println(hashMap.get("1"));
    }
}
