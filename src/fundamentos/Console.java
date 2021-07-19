package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scan.nextLine();
        System.out.print("Digite seu sobrenomenome: ");
        String surname = scan.nextLine();
        System.out.print("Digite o ano de seu nascimento: ");
        int bornYear = scan.nextInt();

        int idade = 2021 - bornYear;


        String completeInformation = String.format("Bem vindo, %s %s. \nDe acordo com os calculos você possui %d anos.", name, surname, idade);
        System.out.println(completeInformation);

        scan.close();
    }
}
