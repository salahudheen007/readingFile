import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteTest {
    public static void main(String[] args) throws IOException {
        String person="Raina 34";
        Path path=Path.of( "C:\\Users\\salah\\IdeaProjects\\reading_file\\text.txt");
       Files.writeString(path,person);
       Scanner sc=new Scanner(path);
               while(sc.hasNextLine()){
                   System.out.println(sc.nextLine());
               }

    }
}
