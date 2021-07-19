package generics;

import java.util.Objects;

public class Par<K, V> {

    private K chave;
    private V value;

    public Par() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return chave.equals(par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }

    public Par(K chave, V value) {
        this.chave = chave;
        this.value = value;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
