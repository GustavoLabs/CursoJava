package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro => " + monstro.vida() );
        System.out.println("Heroi => " + heroi.vida() );

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro => " + monstro.vida() );
        System.out.println("Heroi => " + heroi.vida() );

        System.out.println("x: " + monstro.x);
        System.out.println("y: " + monstro.y);
    }
}
