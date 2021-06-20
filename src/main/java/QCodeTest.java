import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.ImageHelpers;
import com.yzk18.commons.QRCodeHelpers;

import java.awt.image.BufferedImage;

public class QCodeTest {
    public static void main(String[] args) {
        //生成二维码
        /*
        BufferedImage img =  QRCodeHelpers.generateQRCodeImage("https://www.baidu.com", 200, 200);
        ImageHelpers.writeToFile(img, "jpg", "D:/temp/address.jpg");
         */
        String[] picts = IOHelpers.getFilesRecursively("D:/temp", "jpg", "png");
        boolean hasQR = false;
        boolean hasQRAddres = false;
        for (String file: picts) {
            Result result =  QRCodeHelpers.parseImage(file);
            System.out.println(result);
            if (result != null) {
                String text = result.getText();
                if (text.startsWith("http://") || text.startsWith("https://")) {
                    hasQRAddres = true;
                    break;
                }
            }
        }
        if (hasQRAddres) {
            System.out.println("有网站的二维码");
        }
    }
}
