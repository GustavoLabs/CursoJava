package controle;


import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = "";
        while (!entrada.equalsIgnoreCase("sair")) {
            System.out.print("Você diz:");
            entrada = scan.nextLine();
            
        }


        scan.close();
    }
}
