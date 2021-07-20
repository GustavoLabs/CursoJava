package classe;

import java.awt.geom.Area;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(10);
        AreaCirc a2 = new AreaCirc(5);


        System.out.println(a.area());
        System.out.println(a2.area());

        System.out.println(AreaCirc.PI);
        System.out.println(AreaCirc.area(10));


    }
}
