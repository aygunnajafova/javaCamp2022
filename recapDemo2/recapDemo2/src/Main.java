public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 9.4, 5.6};
        double total=0;
        double max=myList[0];
        for(double number: myList) {
            if(number>max) max=number;
            total+=number;
            System.out.println(number);
        }
        System.out.println("Total is: " + total);
        System.out.println("Max is: " +max);
    }
}