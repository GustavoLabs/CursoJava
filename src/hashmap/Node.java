package hashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node<K, V> {

    private List<Data> nodeList = new LinkedList<>();


    public void add(K key, V value){
        nodeList.add(new Data(key, value));
    }

    public Object get(K key){
        List<Object> arrString = new ArrayList<>();
         for(Data data : nodeList){
             if (data.getKey() == key){
                  arrString.add(data.getValue());
             }
         }
         return arrString;
    }
    public String toString(){
        String result = "";
        for (Data data : nodeList){
            result +=  data + " ";
        }
        return result;
    }


}
