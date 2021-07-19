package oo.composicao.desafio.mercado;

public class MarketPlace {

    public static void main(String[] args) {

        Client c1 = new Client("Gustavo");

        Buy b1 = new Buy();
        b1.addItem("Caneta", 2.99, 1);
        b1.addItem("Caderno", 18.90, 1);
        b1.addItem("Bolsa", 99.90, 1);

        Buy b2 = new Buy();
        b2.addItem("Bolacha", 3.50, 1);
        b2.addItem("Agua 2l", 5.49, 1);
        b2.addItem("Bolsa", 99.90, 1);

        Buy b3 = new Buy();
        b3.addItem("Chocolate", 4.59, 2);
        b3.addItem("Monster", 6.59, 6);

        c1.add(b1);
        c1.add(b2);
        c1.add(b3);

        System.out.println(c1);

        System.out.println("O valor total de compra do cliente " + c1.nome + " foi de R$: " + c1.finalPurchase());
    }
}
