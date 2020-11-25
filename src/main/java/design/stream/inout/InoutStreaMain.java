package design.stream.inout;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InoutStreaMain {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(new File("a.txt"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

    }
}
