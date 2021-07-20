package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Gustavo");

        lista.add(u1);
        lista.add(new Usuario("Solange"));
        lista.add(new Usuario("Fabiana"));
        lista.add(new Usuario("Helena"));
        lista.add(new Usuario("Gabriela"));


        System.out.println("Acessando: " +lista.get(3)); // acessar pelo index
        System.out.println("Meu tamanho é: " + lista.size());

        System.out.println(">>>>> " + lista.remove(0));
        System.out.println("Acessando: " +lista.get(3)); // acessar pelo index
        System.out.println(lista.remove(new Usuario("Fabiana")));
        System.out.println("Meu tamanho é: " + lista.size() );

        System.out.println("Tem? " + lista.contains(new Usuario("Fabiana")));



        for(Usuario u : lista){
            System.out.println(u);
        }
    }
}
