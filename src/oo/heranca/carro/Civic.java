package oo.heranca.carro;

public class Civic extends  Carro implements Luxo{

    public Civic(){
        super(212);
    }

    private boolean ligarAr = false;

    @Override
    public void desligaAr() {
        ligarAr = false;
    }

    @Override
    public void ligaAr() {
        ligarAr = true;
    }

    @Override
    public int nivelAr() {
        return Luxo.super.nivelAr();
    }
}
