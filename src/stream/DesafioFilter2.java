package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DesafioFilter2 {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3899.99, 0.31, true);
        Produto p2 = new Produto("Caneta", 8.90, 0.10, false);
        Produto p3 = new Produto("Caderno", 40, 0.4, false);
        Produto p4 = new Produto("Mesa", 2899.90, 0.50, true);
        Produto p5 = new Produto("Computador Gamer", 7900, 0.20, true);
        Produto p6 = new Produto("Carregador", 40, 0.30, true);

        Predicate<Produto> freteGratis =
                p -> p.freteGratis;

        Predicate<Produto> desconto =
                p -> p.desconto >= 0.30;

        Predicate<Produto> precoRelevante =
                p -> p.preco >= 200;

        Function<Produto, String> stringProduto =
                p -> "Aproveite " + p.nome + " por R$" + p.preco;

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        List<String> listProduto = produtos.stream()
                .filter(freteGratis)
                .filter(desconto)
                .filter(precoRelevante)
                .map(stringProduto)
                .collect(Collectors.toList());


        listProduto.forEach(System.out::println);
    }
}
