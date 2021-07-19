package HashDesafio;

public class Node<K, V> {
    private K key;
    private V value;

    public Node(K key, V value ) {
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Key: " + this.key + "| Value: " + this.value;
    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
