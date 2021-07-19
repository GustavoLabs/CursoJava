package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Produto produto = new Produto("Caderno", 20, 0.15);

        Predicate<Produto> isExpensive =
                p -> p.preco >= 10;

        boolean teste = isExpensive.test(produto);

        Function<Produto, String> namePrice =
                p -> p.nome + " R$" + p.preco;

        Function<String, String> priceExclamation =
                s -> s + "!!!";

        Function<Boolean, String> isCaro = boo -> {
            if(boo){
                return " está caro";
            }else
            {
                return " está no preço";
            }
        };

//        System.out.println(namePrice.andThen(isCaro.apply(teste)).andThen(priceExclamation).apply(produto));

        System.out.println(isCaro.apply(teste));
    }
}
