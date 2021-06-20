import java.io.File;

public class FileTest01 {
    public static void main(String[] args) {
        File f1 = new File("D:/temp/1.txt");
        File f2 = new File("D:/temp");
        File f3 = new File("D:/temp/d1/d5/1.txt");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        File f4 = new File("D:/temp/d1/d5");
        f4.delete();

    }
}
