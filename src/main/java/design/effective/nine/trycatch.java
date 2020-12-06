package design.effective.nine;

import java.io.*;

public class trycatch {
    static void copy(String src,String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] bytes = new byte[16];
                int n ;
                while ((n=in.read(bytes))>=0){
                    out.write(bytes,0,n);
                }
            }finally {
                out.close();
            }

        }finally {
            in.close();
        }
    }
}
