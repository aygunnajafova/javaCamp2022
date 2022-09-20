import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3};
        arr = new int[4];
        System.out.println(arr[0]);

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(20);
        list.add("asdfg");
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.set(1, 4567.12);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        for(Object i: list) {
            System.out.println(i);
        }
    }
}