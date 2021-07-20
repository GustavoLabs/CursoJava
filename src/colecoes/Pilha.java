package colecoes;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pilha {

    public static void main(String[] args) {

        Queue<String> livros  = new ArrayDeque<>();
        livros.add("O Pequeno Príncipe");
        livros.add("Don Quixote");
        livros.add("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.size());
        for(String livro: livros){
            System.out.println("Livro: " + livro);
        }
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

        livros.clear();
        System.out.println(livros.isEmpty());
    }
}
