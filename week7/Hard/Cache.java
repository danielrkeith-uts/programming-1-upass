import java.util.LinkedList;

public class Cache<K, V> {

    private LinkedList<Entry<K, V>> entries;

    public Cache() {
        entries = new LinkedList<Entry<K, V>>();
    }

    public void add(K key, V value) {
        Entry<K, V> entry = new Entry<K, V>(key, value);
        entries.add(entry);
    }

    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean remove(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entries.remove(entry);
                return true;
            }
        }
        
        return false;
    }

}
