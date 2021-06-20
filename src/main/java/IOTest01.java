import com.yzk18.commons.IOHelpers;

public class IOTest01 {
    public static void main(String[] args) {
        String content = IOHelpers.readAllText("D:/temp/1.txt");
        System.out.println(content);
    }
}
