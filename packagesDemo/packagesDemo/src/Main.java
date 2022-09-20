import math.FourOperation;
import math.Logarithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

        FourOperation fourOperation = new FourOperation();
        System.out.println(fourOperation.Sum(4, 5));

        Logarithm logarithm = new Logarithm();
        logarithm.LogarithmCalculate(1);

    }
}