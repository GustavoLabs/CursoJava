package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(01,04,1999);

        Data d2 = new Data();
        d2.dia = 11;
        d2.mes = 04;
        d2.ano = 1968;

        Data d3 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.printf(d2.obterDataFormatada());
        System.out.println("\n" + d3.obterDataFormatada());


    }


}
