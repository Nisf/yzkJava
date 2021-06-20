import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("q");
        logger.log(Level.INFO, "倪思帆");
        String s1 = new String("333");
        String s2 = s1;
        s1 += "12312";
        System.out.println(s2);
    }
}
