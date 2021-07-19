package oo.heranca.teste;

import oo.heranca.carro.Carro;
import oo.heranca.carro.Civic;
import oo.heranca.carro.Ferrari;

public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(350);
        Carro civic = new Civic();

        ferrari.ligarTurbo();
        ferrari.ligaAr();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.nivelAr());

        ferrari.desligarTurbo();



        civic.acelerar();
        civic.acelerar();

        System.out.println("Ferrari: " +ferrari.returnVelAtual());
        System.out.println("Civic: " + civic.returnVelAtual());
    }


}
