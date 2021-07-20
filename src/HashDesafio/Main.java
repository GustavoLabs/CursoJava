package HashDesafio;

public class Main {

    public static void main(String[] args) {

        Map map = new Map();

        map.put(1, "Gustavo");
        map.put(3, "Fabiana");
        map.put(5, "Solange");
        map.put(6, "Caio");
        map.put(11, "Giovani");
        map.put(3, "Jeferson");
        map.put(1, "Gabriel");

        System.out.println(map.get(1));

        System.out.println(map);
    }
}
