package basic.common.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/29 11:18
 */
public class ClientDemo {
    public static void main(String[] args) {
        try{
            String urlString = "https://www.sina.com.cn/";
            URL url = new URL(urlString);

            InputStream is = url.openStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
