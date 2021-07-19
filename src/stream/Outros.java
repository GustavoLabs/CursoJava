package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {

    public static void main(String[] args) {


        Aluno a1 = new Aluno("Gustavo", 8);
        Aluno a2 = new Aluno("Gabi", 8.5);
        Aluno a3 = new Aluno("Gui", 4.7);
        Aluno a4 = new Aluno("Lua", 5.9);
        Aluno a5 = new Aluno("Gustavo", 8);
        Aluno a6 = new Aluno("Pedro", 8.5);
        Aluno a7 = new Aluno("Gui", 4.7);
        Aluno a8 = new Aluno("Maria", 5.9);

        List<Aluno> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct..");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("\n Skip/Limit");

        list.stream()
                .distinct()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);


        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
