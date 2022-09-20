public class Main {
    public static void main(String[] args) {
        String student1 = "Aygun";
        String student2 = "Valeriya";
        String student3 = "Nergiz";

        String[] students = new String[3];
        students[0] = "Aygun";
        students[1] = "Nergiz";
        students[2] = "Valeriya";

        for(int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("----");

        for(String student: students) {
            System.out.println(student);
        }
    }
}