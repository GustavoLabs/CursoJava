package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome.concat("!!!"));

        Produto p1 = new Produto("Caneta", 12.50, 00.1);

        imprimir.accept(p1);

        Produto p2 = new Produto("Notebook", 3149.99, 0.12);
        Produto p3 = new Produto("Caderno", 20, 0.1);
        Produto p4 = new Produto("Borracha", 5, 00.1);
        Produto p5 = new Produto("Lapis", 2.89, 0.1);


        List<Produto> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        produtos.forEach(imprimir);

        produtos.forEach(p -> System.out.println(p.nome));

        produtos.forEach(System.out::println);
    }
}
