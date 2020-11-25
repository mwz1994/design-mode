package design.mode.decorator.io;

import java.io.*;

public class LowerCaseMain {
    public static void main(String[] args) {
//        readSingleChar();
        readMultipleChar();
    }

    private static void readMultipleChar() {
        try{
            File filePath = new File("src/main/resources/io/text.txt");
            System.out.println("filePath: "+filePath);
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            File file = new File("D:/text.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[fis.available()];
            while (in.read(buf,0,2) != -1){
            }
            System.out.println("read over");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readSingleChar() {
        int c;

        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:/text.txt")));
            while ((c = in.read()) >=0){
                System.out.println("while print read : "+(char) c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
