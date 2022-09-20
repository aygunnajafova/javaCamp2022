public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "City1";
        cities[0][1] = "City2";
        cities[0][2] = "City3";
        cities[1][0] = "City4";
        cities[1][1] = "City5";
        cities[1][2] = "City6";
        cities[2][0] = "City7";
        cities[2][1] = "City8";
        cities[2][2] = "City9";
        System.out.println(cities.length);

        for(int i=0; i<=2; i++) {
            System.out.println("-----");
            for(int j=0; j<=2; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for(String[] city: cities) {
            System.out.println(city[0]);
        }
        System.out.println(cities.length);
    }
}