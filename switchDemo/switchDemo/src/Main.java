public class Main {
    public static void main(String[] args) {

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Kecdiniz!");
                break;
            case 'B':
            case 'C':
                System.out.println("Kecdiniz!");
                break;
            case 'D':
                System.out.println("Kecdiniz!");
                break;
            case 'F':
                System.out.println("Qaldiniz!");
                break;
            default:
                System.out.println("Uygunsuz note daxil etdiniz");
        }
    }
}