package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";



        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        Function<String, String> duvida =
                valor -> valor + "???";

        String resultado1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        String resultado2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(32);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(parOuImpar.apply(33));

    }
}
