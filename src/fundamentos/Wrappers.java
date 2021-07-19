package fundamentos;

public class Wrappers {

    public static void main(String[] args) {
        Byte b = 100;
        Short s  = 1000;
        Integer i = Integer.parseInt("1124214");
        Long l = 100000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(s);

    }
}
