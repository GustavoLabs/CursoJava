package oo.heranca.carro;

public class Ferrari extends  Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    Ferrari() {
        this(315);
        setDelta(5);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(20);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    @Override
    public void desligaAr() {
        ligarAr = false;
    }

    @Override
    public void ligaAr() {
    ligarAr = true;
    }

}
