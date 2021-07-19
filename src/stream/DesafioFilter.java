package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gustavo", 1194.53, true);
        Cliente c2 = new Cliente("Fabiana", 1494.53, false);
        Cliente c3 = new Cliente("Gui", 194.53, true);
        Cliente c4 = new Cliente("Lia", 114.53, false);
        Cliente c5 = new Cliente("Bia", 3580.67, true);
        Cliente c6 = new Cliente("Ariel", 50, false);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Cliente> comprouUltimoMes =
                c -> c1.comprouUltimoMes;
        Predicate<Cliente> compraTotalGrande =
                c -> c.comprasTotais >= 250;
        Function<Cliente, String> printCliente =
                c -> "Obrigado por comprar conosco no ultimo mês " + c.nome + "! Seu total de compras é: " + c.comprasTotais;

        clientes.stream()
                .filter(comprouUltimoMes)
                .filter(compraTotalGrande)
                .map(printCliente)
                .forEach(System.out::println);
    }
}
