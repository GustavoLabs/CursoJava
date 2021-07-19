package oo.heranca;

public class Jogador {

    public int x;
    public int y;
    protected int vida = 100;


    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar (Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
        } else if (deltaX == 1 && deltaY == 0){
            oponente.vida -= 10;
        } else
        {
            return  false;
        }

        return true;
    }

    public String vida(){
        return "Vida : " + vida;
    }


    public boolean andar(Direcao direcao){

        switch(direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            case SUL:
                y++;
                break;

        }

        return true;
    }

    public int positionX(){
        return x;
    }

    public int positionY(){
        return y;
    }

}
