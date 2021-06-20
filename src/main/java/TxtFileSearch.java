import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TxtFileSearch {
    public List<String> res = new ArrayList<>();
    public void find (File root) {
        File[] sons = root.listFiles();
        if (sons == null) return;
        for (File son: sons) {
            if (son.isFile() && son.getName().split("\\.")[1].equals("txt")) {
                res.add(son.toString());
            } else {
                find(son);
            }
        }
    }
    public static void main(String[] args) {
        TxtFileSearch tfs = new TxtFileSearch();
        tfs.find(new File("D:/temp"));
        for (String file: tfs.res) {
            System.out.println(file);
        }
    }
}
