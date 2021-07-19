package fundamentos;

public class Ternario {

    public static void main(String[] args) {
        double media = 1.0;
        String recuperacao = media>= 5 ? "Recuperacao" : "Reprovado";
        String resultado = media > 7 ? "Aprovado e foi bem" : recuperacao;
        System.out.println(resultado);
    }
}
