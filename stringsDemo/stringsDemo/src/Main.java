public class Main {
    public static void main(String[] args) {
        String msg = "Today weather is so good.";

        System.out.println(msg);
        System.out.println("Char count: " + msg.length());
        System.out.println("5. element: " + msg.charAt(4));
        System.out.println(msg.concat(" Aygun!"));
        System.out.println(msg.startsWith("A"));
        System.out.println(msg.endsWith("."));
        char[] characters = new char[5];
        msg.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(msg.indexOf('a'));
        System.out.println(msg.lastIndexOf("Ay"));

        String newMsg = msg.replace(' ', '-');
        System.out.println(newMsg);
        System.out.println(msg.substring(6, 13));

        for(String word: msg.split(" ")) {
            System.out.println(word);
        }

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
    }
}