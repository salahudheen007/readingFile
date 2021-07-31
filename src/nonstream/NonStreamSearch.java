package nonstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NonStreamSearch {
    public static void main(String[] args) throws IOException {

       String data=new String(Files.readAllBytes(Paths.get("C:\\Users\\salah\\IdeaProjects\\reading_file\\data.csv")));
        String dataLines[]=data.split("\n");
        System.out.println(data);
        for (int i=0;i< dataLines.length;i++){
            System.out.println(dataLines[i]);
        }
    }
}
