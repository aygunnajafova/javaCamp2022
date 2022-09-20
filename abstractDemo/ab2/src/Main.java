public class Main {
    public static void main(String[] args) {
        GameManager[] gameManagers = {new MenGameManager(), new WomenGameManager()};
        for(GameManager gameManager: gameManagers) {
            gameManager.calculate();
        }
    }
}