import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Aygun");
        list.add("Nergiz");
        list.add("Sakina");
        list.add("Valeriya");
        list.add("Gunel");
        list.add("Aygun");
        list.remove("Aygun");
        //System.out.println(list.get(4));

        Collections.sort(list);
        for(String name: list) {
            System.out.println(name);
        }
    }
}