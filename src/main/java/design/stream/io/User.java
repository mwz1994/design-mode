package design.stream.io;

import java.io.*;

public class User implements Serializable {
    private String username;
    private int age;
    User(String name,int age){
        this.username = name;
        this.age = age;
    }

    public static String toString(User user){
        System.out.println(user.username+" : "+user.age);
        return user.username+" : "+user.age;
    }


    public static void main(String[] args) throws IOException {
        //outputStream写入文件
        User user = new User("二营长",18);
        String eyz = "D:\\二营长.txt";

        File writePath = new File(eyz);
        OutputStream writeStream = new FileOutputStream(writePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(writeStream);
        outputStreamWriter.write(toString(user));
        outputStreamWriter.close();

        //writer写入文件
        String qbl = "D:\\骑兵连.txt";
        File outPath = new File(qbl);
        FileOutputStream fileOutputStream = new FileOutputStream(outPath);
        User rideUser = new User("骑兵连",25);
        fileOutputStream.write(toString(rideUser).getBytes());
        fileOutputStream.close();

        //reader读取文件
        File readerPath = new File(eyz);
        FileReader fileReader = new FileReader(readerPath);
        BufferedReader bf = new BufferedReader(fileReader);
        StringBuffer sb = new StringBuffer();
        String s;
        while ((s=bf.readLine()) != null){
            sb.append(s);
        }
        bf.close();
        System.out.println("file reader : "+sb.toString());

    }
}
