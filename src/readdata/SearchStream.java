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
                            "   hu site            :" + data[4] + "\n" +
                            "   point granularity  :" + data[17] + "\n" +
                            "   construction       :" + data[16];
                }
            }
        } else {
            return "enter valid 6 digit id";
        }
        return "";
    }

    public String searchbyContruction(String constructionType) throws IOException {
        String line = "";
        int count = 0;
        int sumGranularity = 0;
        while ((line = myreader.readLine()) != null) {
            String[] data = line.split(",");
            if (data[16].equals(constructionType)) {
                count++;
                sumGranularity = sumGranularity + Integer.parseInt(data[17]);

            }
        }
        if (count == 0) {
            System.out.println("no policy found or invalid construction type");
        } else {
            return "details \n" +
                    "    number of entries   " + count + "\n" +
                    "   sum of granularity  " + sumGranularity;
        }
        return "";
    }
}
