package design.effective.nine;

import java.io.*;

public class trywithresource {
    public void twr(String src,String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)
        ){
            byte[] buf = new byte[16];
            int n;
            while ((n=in.read(buf))>0){
                out.write(buf);
            }
        }
    }
}
