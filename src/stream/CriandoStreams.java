package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "JS ", "Python");
        langs.forEach(print);

        System.out.println("\n");
        String[] maisLangs= {"Python ", "Go ", "Lips "};

        Stream.of(maisLangs).forEach(print);
        System.out.println("\n");
        Arrays.stream(maisLangs).forEach(print);
        System.out.println("\n");
        Arrays.stream(maisLangs, 1, 3).forEach(print);
        System.out.println("\n");

        List<String> outrasLangs = Arrays.asList("A ", "C ", "C++ ");
        outrasLangs.stream().forEach(print);
        System.out.println("\n");
        outrasLangs.parallelStream().forEach(print);
        System.out.println("\n");

        //Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
