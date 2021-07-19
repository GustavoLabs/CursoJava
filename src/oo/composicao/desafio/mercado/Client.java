package oo.composicao.desafio.mercado;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String nome;
    List<Buy> purchases = new ArrayList<>();

    public Client(String nome) {
        this.nome = nome;
    }

    void add(Buy buy){
        purchases.add(buy);
    }

    public String toString(){
        String finalString = "";
        for(Buy b : purchases){
            finalString += b;
        }
        return finalString;
    }

    public double finalPurchase(){
        double finalTotal = 0;
        for(Buy buy : purchases){
            finalTotal += buy.finalValue();
        }
        return finalTotal;
    }




}
