package design.stream.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Directory {

    public static File[] getLocalFiles(File dir,final String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] getLocalFiles(String path,final String regex) {
        return getLocalFiles(new File(path),regex);
    }

    public static void main(String[] args) {
        String dir = "d:"+File.separator;
        File[] files = Directory.getLocalFiles(dir,".*"+File.separator+".txt");
        for (File file:files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
