package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = new ArrayList();

        aprovados.add("Ana");
        aprovados.add("Bia");
        aprovados.add("Lia");
        aprovados.add("Gui");

        System.out.println("Forma tradicional...");
        for (String aprovado : aprovados){
            System.out.println(aprovado);
        }

        System.out.println("\nLambda #01..");
        aprovados.forEach(nome-> System.out.println(nome + "!!!!"));

        System.out.println("\nMethod Reference#01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02..");
        aprovados.forEach(nome-> meuImprimir(nome));

        System.out.println("\nMethod Reference#02...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Oi meu nome é: " + nome);
    }
}

