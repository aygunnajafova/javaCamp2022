public class Main {
    public static void main(String[] args) {
        String msg = "Today weather are so good";
        String newMsg = msg.substring(0,2);
        System.out.println(newMsg);
        int num = multiply(5, 7);
        System.out.println(num);
        int sum = multiply2(1, 2, 3);
        System.out.println(sum);

    }

    public static void add() {
        System.out.println("Added");
    }

    public static void remove() {
        System.out.println("Removed");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int multiply(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply2(int... numbers) {
        int sum = 0;
        for(var num: numbers) {
            sum+=num;
        }
        return sum;
    }

    public static String cityGive() {
        return "Baku";
    }
}