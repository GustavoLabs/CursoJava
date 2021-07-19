package HashDesafio;

import java.util.LinkedList;
import java.util.List;

public class DataList<K, V> {
    List<Node> lista = new LinkedList<>();

    void add(int key, String value ){
        lista.add(new Node(key, value));
    }

    String get(K key){
        String finalResult = "";
        for(Node node : lista){
            if (node.getKey() == key){
              finalResult += " ~~ " + node.getValue() + " ~~ ";
            }
        }
        return finalResult;
    }

    public String toString(){
        return lista.toString();
    }

}
