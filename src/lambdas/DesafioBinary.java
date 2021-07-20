package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinary {

    public static void main(String[] args) {

        Produto produto = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> valorDesconto =
                p -> p.preco * ( 1 - p.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> round =
                preco -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar =
                preco -> ("R$ " + preco).replace(".", ",");

        String resultadoFinal =
                valorDesconto
                        .andThen(impostoMunicipal)
                        .andThen(frete)
                        .andThen(round)
                        .andThen(formatar)
                        .apply(produto);

        System.out.println(resultadoFinal);
    }

}
