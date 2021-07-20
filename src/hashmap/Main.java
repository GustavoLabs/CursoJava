package hashmap;

public class Main {

    public static void main(String[] args) {

        Map m = new Map();
        m.put('a', 45);
        m.put(1, 90);
        m.put("gustavo", 1);
        m.put(true, "caique");
        m.put(true, "caique");
        m.put(true, "caique");
        m.put(true, "caique");
        m.put(true, 12);
        m.put(true, false);

        m.put(5,2);
        m.put(3,2);
        m.put(2,2);
        m.put(6,2);

        System.out.println(m.get(true));

        System.out.println(m);
    }
}
