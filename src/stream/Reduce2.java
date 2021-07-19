package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gustavo", 8);
        Aluno a2 = new Aluno("Gabi", 8.5);
        Aluno a3 = new Aluno("Gui", 4.7);
        Aluno a4 = new Aluno("Lua", 5.9);

        List<Aluno> list = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado =
                a -> a.nota >= 5;

        Function<Aluno, Double> apenasNota =
                a -> a.nota;

        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        list.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

    }
}
