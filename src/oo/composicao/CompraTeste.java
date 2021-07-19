package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Gustavo Gouvea";
        compra1.add("Água 2L", 20, 7.45);
        compra1.add("Bolacha", 12, 3.89);
        compra1.add("Caderno", 3, 18.79);

        System.out.println(compra1);



    }
}
