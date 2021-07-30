package readdata;

import java.io.IOException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("search by id(a) or construction type(b)");
        String option=sc.nextLine();
        SearchStream mysearch=new SearchStream();
        if(option.equals("a")){
            System.out.println("enter the id");
            String id= sc.nextLine();
            String data= mysearch.searchbyId(id);
            System.out.println(data);
        }
        else if(option.equals("b")){
            System.out.println("enter construction type");
            String constructionType=sc.nextLine();
            String data=mysearch.searchbyContruction(constructionType);
            System.out.println(data);

        }else{
            System.out.println("enter correct option");
        }
    }
}
