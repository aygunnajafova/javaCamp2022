public class Main {
    public static void main(String[] args) {
        numberFinding();
    }

    public static void numberFinding() {
        int[] numbers = new int[] {1, 2, 0, 5, 7, 9};
        int number = 5;
        boolean cond = false;
        for(var n: numbers) {
            if(n == number) {
                cond = true;
                break;
            }
        }
        if(cond) msgGive("This number is available in array: " + number);
        else System.out.println("This number isn't available in array");
    }

    public static void msgGive(String msg) {
        System.out.println(msg);
    }
}