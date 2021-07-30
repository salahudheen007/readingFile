package readdata;

import java.io.*;

public class SearchStream {
    File myFile = new File("C:\\Users\\salah\\IdeaProjects\\reading_file\\data.csv");
    BufferedReader myreader = new BufferedReader(new FileReader(myFile));

    public SearchStream() throws FileNotFoundException {
    }

    public String searchbyId(String id) throws IOException {
        String line = "";
        if (id.length() == 6) {
            while ((line = myreader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    return "data:" + id + "\n" +
                            "   statecode          :" + data[1] + "\n" +
                            "   eq site            :" + data[3] + "\n" +
                            "   eq_site            :" + data[4] + "\n" +
                            "   point granularity  :" + data[17] + "\n" +
                            "   construction       :" + data[16];
                }else {
                    return "id not found";
                }
            }
        }else{
            return "enter valid 6 digit id";
        }
        return "";
    }
    public String searchbyContruction(String constructionType){
        
    }
}
