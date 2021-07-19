package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos numéricos inteiros
        byte anosDeEmpresa= 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_545_223L;

        // tipos numéricos reais
        float salario = 11_445.33F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo Booleano
        boolean estaDeFerias = false; //true

        // tipo caractere
        char status = 'A'; // ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //Número de viagens
        System.out.println(numeroDeVoos/2);

        //Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + ": ganha ->" + salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status" + status );
    }
}
