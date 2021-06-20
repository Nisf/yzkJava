import com.yzk18.commons.IOHelpers;

public class ThreeGrades {
    public static void main(String[] args) {
        String src = "D:/temp";
        String gradeTxt = src + "/three.txt";
        String[] grades = IOHelpers.readAllLines(gradeTxt);
        for (String grade: grades) {
            String[] items = grade.split(",");
            String name = items[0];
            Double chinese = Double.valueOf(items[1]);
            Double english = Double.valueOf(items[2]);
            Double math = Double.valueOf(items[3]);
            Double avg = (chinese + english + math) / 3;
            String ans = name + "你好, " + "你的英语成绩是" + english + ", 你的数学成绩是" + math +
                    ", 你的语文成绩是" + chinese + ", 你的平均分是" + String.format("%.2f", avg);

            IOHelpers.writeAllText(src + "/" + name + ".txt", ans);
        }
    }
}
