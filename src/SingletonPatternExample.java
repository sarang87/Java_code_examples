public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a singleton logger"); // Output: Log: This is a singleton logger
    }
}