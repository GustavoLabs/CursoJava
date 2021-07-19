package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    private ArrayList<Item> itens = new ArrayList<>();

    void add (String nome, int quantidade, double preco){
        itens.add(new Item(nome, quantidade, preco));
    }

    double  valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.preco * item.quantidade;
        }
        return total;
    }


    public String toString(){
        String totalItens = "";
        for(Item item: itens){
            totalItens += String.format("%s, com %d unidades e cada uma custa %.2f \n" , item.nome, item.quantidade, item.preco );
        }

        totalItens += "\nTotal: " + valorTotal();
        return totalItens;
    }


}
