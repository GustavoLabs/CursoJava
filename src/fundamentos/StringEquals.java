package fundamentos;

import java.util.Scanner;

public class StringEquals {

    public static void main(String[] args) {

        // sempre usar equials para comparar Strings
        String s ="2";
        System.out.println("2" == s);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a String para remover os espaços: ");
        String s1 = scan.nextLine();
        System.out.println(s1.equals("2"));
        s1 = s1.trim();
        System.out.println(s1.equals("2"));


    }
}
