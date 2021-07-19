package fundamentos;

public class ConversaoTipoPrimirivoNumerico {

    public static void main(String[] args) {

        double a = 1; // armazena numeros grandes
        System.out.println(a);

        float b = (float) 1.12345678888888; // será truncado
        System.out.println(b);

        int c = 128;
        byte d = (byte) c; // conversão com CAST, indicando para qual tipo será convertido
        System.out.println(d);

    }
}
