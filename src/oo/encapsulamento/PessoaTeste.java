package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gustavo", -30);
        p1.setIdade(-45);

        System.out.println(p1.getIdade());

        System.out.println(p1);
    }
}
