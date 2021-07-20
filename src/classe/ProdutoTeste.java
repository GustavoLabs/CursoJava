package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto.desconto = 0.80;

        Produto prod1 = new Produto("Notebook");
        prod1.preco = 4356.89;


        Produto prod2 = new Produto("Caneta Preta");
        prod2.nome = "Caneta Preta1";
        prod2.preco = 12.56;


        Produto prod3 = new Produto();
        prod3.nome = "Caneta Azul";
        prod3.preco = 12.56;

        System.out.println(prod1.nome + "\n" + prod2.nome + "\n" + prod3.nome);

        double precoFinalp1 = prod1.precoComDesconto();
        double precoFinalp2 = prod2.precoComDesconto();
        double precoFinalp3 = prod3.precoComDesconto(0.20);

        System.out.println("Valor do produto 3: " + prod3.precoComDesconto());

        System.out.printf("O valor com desconto do produto1 será : %.2f e do produto2: %.2f \n", precoFinalp1, precoFinalp2);
        System.out.println("A media dos preços será: " + (precoFinalp1 + precoFinalp2) / 2);

    }
}
