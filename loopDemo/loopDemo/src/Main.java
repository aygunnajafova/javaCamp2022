public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println("Loop is over");

        //While
        System.out.println("-----");
        int i = 1;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        //Do While
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while(j<10);

        System.out.println("Do-While is overed");
    }
}