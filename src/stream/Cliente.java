package stream;

public class Cliente {

    String nome;
    double comprasTotais;
    boolean comprouUltimoMes;

    public Cliente(String nome, double comprasTotais, boolean comprouUltimoMes) {
        this.nome = nome;
        this.comprasTotais = comprasTotais;
        this.comprouUltimoMes = comprouUltimoMes;
    }
}
