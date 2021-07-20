package classe;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    Pessoa(){

    }
    Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void comer(Comida c){
        if(c != null){
            this.peso += c.peso;
        }
    }

    String apresentar(){
        return String.format("eu sou %s e estou pesando %.2f KGs.\n", this.nome, this.peso);
    }
}
