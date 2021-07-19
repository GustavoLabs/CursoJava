package oo.heranca.carro;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    protected int velAtual;
    private int delta = 5;

    protected Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    public void acelerar(){

        if (velAtual + getDelta() > VELOCIDADE_MAXIMA){
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual += getDelta();
        }
    }

    public void frear(){
        if (velAtual >= 5){
            velAtual -= 5;
        } else {
            velAtual = 0;
        }
    }

    public int returnVelAtual(){
        return velAtual;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
