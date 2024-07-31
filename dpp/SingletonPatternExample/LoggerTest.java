// File: src/LoggerTest.java
import com.example.singleton.logging.Logger;

public class LoggerTest {
    public static void main(String[] args) {
        // Attempt to get multiple instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Singleton pattern is working. Both instances are the same.");
        } else {
            System.out.println("Singleton pattern failed. Instances are different.");
        }

        // Use the logger to print a message
        logger1.log("This is a test log message.");
    }
}
