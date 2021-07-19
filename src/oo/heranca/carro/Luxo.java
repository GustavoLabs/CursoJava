package oo.heranca.carro;

public interface Luxo {

    void desligaAr();
    void ligaAr();
    default int nivelAr(){
        return 15;
    }
}
