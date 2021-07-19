package HashDesafio;

public class Map {

    private DataList[] arrNode;

    public Map() {
        arrNode = new DataList[10];
    }

    void put(int key, String value ){
        int hash = key % 10;
        if (arrNode[hash] == null) {
            arrNode[hash] = new DataList();
        }
        arrNode[hash].add(key, value);
    }

    String get(int key){
        int hash = key % 10;
        return arrNode[hash].get(key);
    }

    public String toString(){
        String finalString = "";
        for(DataList node : arrNode){
            if(node != null) {
                finalString += node + "\n";
            }
        }
        return finalString;
    }
}
