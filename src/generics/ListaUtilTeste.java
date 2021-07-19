package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS", "Java", "Python","PHP");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguaguem = (String) ListaUtil.getUltimo1(langs);
        Integer ultimoNum = (Integer) ListaUtil.getUltimo1(nums);

        System.out.println(ultimaLinguaguem);
        System.out.println(ultimoNum);

        String ultimaLinguaguem2 = ListaUtil.getUltimo2(langs);
        Integer ultimoNum2 = ListaUtil.getUltimo2(nums);

        System.out.println(ultimaLinguaguem2);
        System.out.println(ultimoNum2);





    }
}
