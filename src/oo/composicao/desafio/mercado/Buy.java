package oo.composicao.desafio.mercado;

import java.util.ArrayList;
import java.util.List;

public class Buy {
    List<Item> items = new ArrayList();

    void addItem(String name, double price, int amout){
        items.add(new Item(new Product(name, price), amout));
    }

    double finalValue(){
        double total = 0;
        for (Item item : items){
            total += item.quantidade * item.produto.price;
        }
        return total;
    }

    public String toString(){
        String finalString = "";

        for(Item item : items){
            finalString += item;
        }
        return finalString;
    }

}
