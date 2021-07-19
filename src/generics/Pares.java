package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {

    private final Set<Par<K, V>> itens = new HashSet<>();

    public void adicionar(K key, V value){
        if(key == null) return;

        Par<K, V> newNode = new Par(key, value);
        if (itens.contains(newNode)){
            itens.remove(newNode);
        }

        itens.add(newNode);
    }

    public V getValor (K key){
        if (key == null) return null;
        Optional<Par<K, V>> parOpc =  itens.stream()
                .filter(par -> key.equals(par.getChave()))
                .findFirst();

        return parOpc.isPresent() ? parOpc.get().getValue() : null;
    }
}
