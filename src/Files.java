import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try{
            File myfile=new File("C:\\Users\\salah\\IdeaProjects\\reading_file\\new.txt");
            if (myfile.createNewFile()){
                System.out.println("created");
            }else{
                System.out.println("not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
