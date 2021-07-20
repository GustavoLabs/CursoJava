package classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Gustavo Gouvea";
        u1.email = "gustavo.gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Gustavo Gouvea";
        u2.email = "gustavo.gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));



    }
}
