package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static Object ArrayList;

    public static void main(String[] args) {

        List<String> array = new ArrayList<>();

        array.add("Gustavo");
        array.add("Fabiana");

        int[] num = {1,2,3,4};

        Iterator<Integer> in = Arrays.stream(num).iterator();



        while (in.hasNext()){
            int i = in.next();
            System.out.println("dentro");

            Iterator<String> is = array.iterator();
            while (is.hasNext()){
                System.out.println(i + is.next());
            }
        }


    }
}
