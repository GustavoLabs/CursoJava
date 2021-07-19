package oo.composicao.desafio.mercado;

public class Item {
    Product produto;
    int quantidade;

    public Item(Product produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString(){
    String finalString = String.format("Produto: %s  R$ %.2f  x   %d \n", produto.name, produto.price, quantidade);
    return finalString;
    }
}
