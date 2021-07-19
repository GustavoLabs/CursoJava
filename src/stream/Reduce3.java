package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

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

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);

        Media media = list.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("Media é " + media.getValor());
    }
}
