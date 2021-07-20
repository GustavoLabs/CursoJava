package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá".charAt(0));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("tarde"));
        System.out.println(s);
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        System.out.println("\n\n");
        String nome = "Gustavo";
        String sobreNome = "Gouvea";
        int idade = 22;
        double salario = 1000;

        System.out.printf("%s %s possui %d anos e ganha %.2f", nome, sobreNome, idade, salario);



    }
}
