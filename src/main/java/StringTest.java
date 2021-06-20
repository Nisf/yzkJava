public class StringTest {
    public static void main(String[] args) {
        String s1 = "D:/a/b/c.txt";
        String[] res = s1.split("/");
        int idx = s1.lastIndexOf("/");
        System.out.println(s1.substring(idx + 1));
        System.out.println(res[res.length - 1]);
        String[] strs = s1.split("\\.");
        System.out.println("." + strs[strs.length - 1]);
        String admin = "   ADmin   ";
        String pwd = "123456";
        if (admin.trim().equalsIgnoreCase("admin") && pwd.equals("123456")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
        String s2 = "name=你司法";
        String[] ss = s2.split("=");
        System.out.println(ss[0] + " " + ss[1]);
        String s3 = "D:/a/v/c.JPg";
        String[] sss = s3.split("\\.");
        if (s3.toLowerCase().endsWith("jpg")) {
            System.out.println("正确");
        } else {
            System.out.println("错误!");
        }
    }
}
