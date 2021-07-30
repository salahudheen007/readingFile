import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\salah\\IdeaProjects\\reading_file\\text.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println("//////////////////////////////////////\n");
        BufferedReader rd=new BufferedReader(new FileReader(file));
        String read;
        while ((read=rd.readLine())!=null){
            System.out.println(read);
        }
        FileReader fr=new FileReader(file);
        int i;
        while ((i= fr.read())!=-1){
            System.out.println((char) i);
        }
        String fullData="";
        fullData=new String(Files.readAllBytes(Paths.get("C:\\Users\\salah\\IdeaProjects\\reading_file\\text.txt")));
        System.out.println(fullData);
    }
}
