public class EmailLogger extends BaseLogger {
    public void log(String msg){
        System.out.println("Logged to Email: " + msg);
    }
}
