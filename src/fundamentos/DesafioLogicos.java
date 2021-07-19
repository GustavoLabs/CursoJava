package fundamentos;

public class DesafioLogicos {

    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean familiaSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\" ? " + comprouTV50);
        System.out.println("Comprou Tv 32\" ? " + comprouTV32);
        System.out.println("Comprou Sorvete ? " + comprouSorvete);
        System.out.println("Familia saudável ? " + familiaSaudavel);

    }
}
