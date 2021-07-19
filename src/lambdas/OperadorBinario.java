package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) /2;

        System.out.println(media.apply(10.0, 5.7));

        BiFunction<Double, Double, String> resultadoRecebe =
                (n1, n2) -> ((n1 + n2) /2) >= 7 ? "Aprovado" : "Reprovado";

        String aluno1 = resultadoRecebe.apply(5.7, 0.2);

        System.out.println(aluno1);

        Function<Double, String> conceito =
                m -> m>= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.6, 0.2));
    }
}
