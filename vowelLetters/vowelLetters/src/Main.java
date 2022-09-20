public class Main {
    public static void main(String[] args) {
        char letter = 'E';

        /*
        My Way:
        String letters = "aeou";
        boolean cond = false;
        for(int i=0; i<letters.length(); i++){
            if(letters.charAt(i) == Character.toLowerCase(letter)) {
                cond = true;
                break;
            }
        }
        if(cond) System.out.println("letter is vowel");
        else System.out.println("letter is consonant");
        */

        switch(letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("letter is vowel");
                break;
            default:
                System.out.println("letter is consonant");

        }
    }
}