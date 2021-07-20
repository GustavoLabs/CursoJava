package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        geraErro1();
        geraErro2();

    }

    private static void geraErro1() {
        new RuntimeException("Deu ruim chara #01");
    }

    private static void geraErro2() {
        new Exception("Deu ruim chara #02");
    }
}
