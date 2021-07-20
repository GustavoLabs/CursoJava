package hashmap;

import java.util.Arrays;
import java.util.Objects;

public class Map<K, V> {
    private Node[] arrNode;

    public Map() {
        arrNode = new Node[10];
    }

    public int hashPosition(int hashCode){
        return hashCode % 10;
    }

    public void put(K key, V value){
        int position = hashPosition(Objects.hashCode(key));
        if (arrNode[position] == null){
            arrNode[position] = new Node();
        }

        arrNode[position].add(key, value);

    }


    public Object get(K key){
        int position = hashPosition(Objects.hashCode(key));
        return arrNode[position].get(key);
    }

    public String toString(){
        String result = "";
        for (Node node : arrNode){
            if (node != null){
            result += node + "\n";
            }
        }
        return result;
    }

}
