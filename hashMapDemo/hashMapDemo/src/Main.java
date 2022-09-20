import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("book", "kitab");
        dictionary.put("table", "stol");
        dictionary.put("chair", "stul");
        dictionary.remove("book");
        System.out.println(dictionary.size());

        for(String item: dictionary.keySet()) {
            System.out.println("Key: " + item + ", Value: " + dictionary.get(item));
        }

        dictionary.clear();
    }
}