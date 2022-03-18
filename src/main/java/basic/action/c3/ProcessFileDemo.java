package basic.action.c3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessFileDemo {
    public static void main(String[] args) throws IOException {
        String line = processFile();
        System.out.println("readline "+line);

        String lambdaLine = processFileLambda((BufferedReader br)->br.readLine());
        System.out.println("lambdaLine "+lambdaLine);

        String lambdaLineV2 = processFileLambda((BufferedReader br)->br.readLine()+br.readLine());
        System.out.println("lambdaLineV2 "+lambdaLineV2);
    }

    public static String processFile() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("stopwords.txt"))){
            return br.readLine();
        }
    }

    public static String processFileLambda(BufferedReaderProcessor p) throws IOException{
        try( BufferedReader br = new BufferedReader(new FileReader("stopwords.txt"))){
            return p.process(br);
        }
    }
}
