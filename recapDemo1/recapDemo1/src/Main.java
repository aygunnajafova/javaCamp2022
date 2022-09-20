public class Main {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 120;
        int num3 = 50;

        int bigNum = num1;

        if(num2 > bigNum) {
            bigNum = num2;
        }
        if(num3 > bigNum) {
            bigNum = num3;
        }
        System.out.println("En boyuk sayi: " + bigNum + "'dir");

    }
}