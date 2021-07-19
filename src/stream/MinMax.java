package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Gustavo", 8);
        Aluno a2 = new Aluno("Gabi", 8.5);
        Aluno a3 = new Aluno("Gui", 9.7);
        Aluno a4 = new Aluno("Lua", 10);

        List<Aluno> list = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(list.stream().max(melhorNota).get());
        System.out.println(list.stream().min(melhorNota).get());
    }

}
