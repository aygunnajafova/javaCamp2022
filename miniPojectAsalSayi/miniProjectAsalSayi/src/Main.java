public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        if(number==1) {
            System.out.println("number isn't prime");
            return;
        }
        if(number<1)System.out.println("Wrong number");
        for(int i=2; i<number; i++) {
            if(number%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("numbe is prime");
        else System.out.println("number isn't prime");

    }
}