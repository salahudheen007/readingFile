import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class AddingString {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String userInput= scanner.nextLine();
        String str = userInput+"\n";
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("C:\\Users\\salah\\IdeaProjects\\reading_file\\text.txt", true));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        Path path=Path.of("C:\\Users\\salah\\IdeaProjects\\reading_file\\text.txt");
        Scanner sc=new Scanner(path);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
