package classe;

public class Jantar {

    public static void main(String[] args) {

        Comida lasanha = new Comida("Lasanha", 0.8);
        Comida refri = new Comida();
        refri.nome = "Refrigerante";
        refri.peso = 0.1;
        Comida sobremesa = new Comida("Doce", 1);
        Pessoa gustavo = new Pessoa("Gustavo",22,130);

        System.out.printf(gustavo.apresentar());
        gustavo.comer(lasanha);
        gustavo.comer(refri);
        gustavo.comer(sobremesa);
        System.out.printf(gustavo.apresentar());

    }
}
