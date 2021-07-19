package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa();
        caixaA.setCoisa("Segredo!");

        System.out.println(caixaA.getCoisa());

        Caixa<Double> caixaB = new Caixa();
        caixaB.setCoisa(3.1415);

        System.out.println(caixaB.getCoisa());
    }
}
