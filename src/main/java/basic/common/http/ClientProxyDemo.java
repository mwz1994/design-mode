package basic.common.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/29 11:30
 */
public class ClientProxyDemo {
    public static void main(String[] args) {
        try{
            String urlString = "http://www.ibm.com/developerworks/cn/java/j-javaroundtable/index.html";

            URL url = new URL(urlString);

            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("127.0.0.1",80));

            URLConnection conn = url.openConnection(proxy);
            InputStream is = conn.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

            while (br.readLine() != null){
                System.out.println(br.readLine());
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
